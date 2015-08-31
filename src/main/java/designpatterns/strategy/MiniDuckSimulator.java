package designpatterns.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		/**
		 * Behavior changed at runtime. Not possible if we were using
		 * inheritance than composition.
		 */
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}