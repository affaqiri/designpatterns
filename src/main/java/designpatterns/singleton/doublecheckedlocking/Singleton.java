package designpatterns.singleton.doublecheckedlocking;

/**
 * Another thread-safe implementation but with better performance.
 * 
 * This implementation limits the synchronized keyword to the instantiation
 * block and uses synchronization only during the first passage of the creation
 * process.
 *
 * This implementation does not work for JVM versions below 2.5.
 */
public class Singleton {

	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		/*
		 * Check for an instance and if there isn't one, enter a synchronized
		 * block.
		 */
		if (uniqueInstance == null) {
			/*
			 * We only synchronize the first time through.
			 */
			synchronized (Singleton.class) {
				/*
				 * Once in the block, check again and if still null, create an
				 * instance.
				 */
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
	
}