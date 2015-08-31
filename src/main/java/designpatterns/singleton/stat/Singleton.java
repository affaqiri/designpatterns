package designpatterns.singleton.stat;

/**
 * Thread safe implementation but eager initialization.
 * 
 * Use this method if the application always creates an instance of the
 * Singleton or the overhead of creation and runtime aspects of the Singleton
 * are not onerous.
 * 
 * The JVM guarantees that the instance will be created before any thread
 * accesses the static uniqueInstance variable.
 * 
 * Be aware of multiple class loaders. In that case the Singleton pattern does
 * not work at all regardless of the different thread safe or unsafe
 * implementations.
 */
public class Singleton {
	
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
	
}