package designpatterns.singleton.doublecheckedlocking;

public class SingletonClient {
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
		
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton == singleton2) {
			System.out.println("We are the same singleton instance.");
		}		
	}

}