package designpatterns.templatemethod.barista;

public abstract class CaffeineBeverage {

	/**
	 * The template method is declared final so that the subclasses can not
	 * override and modify the required steps of the algorithm.
	 * 
	 * Pay attention to usage of generic method names such as brew() instead of
	 * brewCoffeeGrinds() and steepTeaBag() and the method name addCondiments()
	 * instead of addSugarAndMilk() and addLemon().
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	/*
	 * Functionalities specific to subclasses must be declared abstract and
	 * implemented by the subclasses as part of the overall algorithm.
	 */
	abstract void brew();

	abstract void addCondiments();

	/*
	 * Concrete implementation of some of the common functionality and steps in
	 * the base class.
	 */
	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
}