package designpatterns.templatemethod.hookedbarista;

public abstract class CaffeineBeverageWithHook {

	/**
	 * Template method with hooked behavior.
	 * 
	 * This give chance to subclasses to override the default behavior of the
	 * hook method customerWantsCondiments() and provide their own behavior.
	 * 
	 * The hook method in the template may be an empty or default
	 * implementation.
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	boolean customerWantsCondiments() {
		return true;
	}
	
}