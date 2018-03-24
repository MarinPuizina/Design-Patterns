package main.java.observerPattern.WeatherStationObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {

		if (observable instanceof WeatherData) {

			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();

		}

	}

	@Override
	public void display() {

		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Warmer, even warmer..");
		} else if (currentPressure == lastPressure) {
			System.out.println("not going to change much");
		} else if (currentPressure < lastPressure) {
			System.out.println("the winter is coming");
		}

	}

}
