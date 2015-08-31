package designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	Observable observable;
	
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/**
	 * We are working in pull method, this means any time we receive a change of
	 * state notification through this method, we ask the Observable (subject)
	 * for the data change that interest us through the getter methods.
	 * 
	 * If we wanted to work as push mode, the second object argument could have
	 * been used to transfer the changed state object from the subject to
	 * observers.
	 */
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
	
}