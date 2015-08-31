package designpatterns.templatemethod.barista;

/**
 * Provides implementation of the steps specific to Coffee class.
 */
public class Coffee extends CaffeineBeverage {
	
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
}