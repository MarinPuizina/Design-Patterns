package main.java.observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();

    }

    private void measurementsChanged() {
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.add(obs);
        }
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }

    }

}
