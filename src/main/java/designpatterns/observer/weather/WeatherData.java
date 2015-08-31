package designpatterns.observer.weather;

import java.util.*;

/**
 * The Subject implementation.
 */
public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	/**
	 * The method responsible for notifying observers in case of state change.
	 * This type of notification is called push notification where the subject
	 * pushes the changed state to its observers.
	 */
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/**
	 * The getter methods are necessary if we wanted to work on pull mode (the
	 * better approach) where the observers ask the subject only for the changed
	 * properties that interest them in case their is a change of state in the
	 * subject.
	 */
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}