package main.java.observerPattern.WeatherStation;

public interface Observer {

    void update(float temperature, float humidity, float pressure);

}
