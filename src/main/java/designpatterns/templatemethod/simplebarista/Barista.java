package designpatterns.templatemethod.simplebarista;

/**
 * Simple implementation without using the template method.
 * 
 * We can see code duplication and similarity of prepareReceipe() method in both
 * Tea and Coffee classes.
 */
public class Barista {

	public static void main(String[] args) {
		
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
		
	}
	
}