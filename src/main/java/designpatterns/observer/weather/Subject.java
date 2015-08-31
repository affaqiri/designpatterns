package designpatterns.observer.weather;

/**
 * The Subject interface.
 * 
 * Should allow the registration/unregistration of observers as well as a
 * mechanism to notify the observers in case its state changes.
 */
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}