package designpatterns.observer.weatherobservable;
	
import java.util.Observable;

/**
 * The subject extends the JDK implementation of Observable base class.
 * 
 * Disadvantage: the Observable is a class, so we are not programming to an
 * interface but to a concrete implementation. Beside that, we can only extend
 * from one class, so our subject class can not inherit from any other class.
 */
public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() { }
	
	public void measurementsChanged() {
		/**
		 * We need to call the setChanged() method the notifyObservers() method,
		 * otherwise the notification will not be send to observers.
		 */
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
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