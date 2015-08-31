package designpatterns.observer.weather;


public class WeatherStationHeatIndex {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		/**
		 * Dynamically added a new observer, maybe during the runtime, without
		 * any change to the subject or other observers, so this is loose
		 * coupling between the observers and the subject. Subject does not have
		 * any information on its dependent observer objects. All it knows is
		 * that they implement a common interface. (programming to interface,
		 * extensibility).
		 */
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
	
}