package designpatterns.observer.weather;

/**
 * Our observer interface.
 * 
 * All observers must implement the update method.
 * 
 * The subject will call this update method any time its state changes.
 * 
 * So We are in a push mode where the Subject pushes the state to observers.
 */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);

}