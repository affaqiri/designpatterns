package designpatterns.singleton.classic;

/**
 * The simplest form of implementation with lazy initialization.
 * 
 * This implementation is not thread safe.
 * 
 * Note: you can have state properties and methods as well in the singleton.
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
	
}