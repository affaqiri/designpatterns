package designpatterns.templatemethod.barista;

/**
 * Provides implementation of the steps specific to Tea class.
 */
public class Tea extends CaffeineBeverage {
	
	public void brew() {
		System.out.println("Steeping the tea");
	}

	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
}