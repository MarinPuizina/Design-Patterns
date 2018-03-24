package main.java.observerPattern;

public class WeatherStation {

    public  static  void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(20, 65, 35.4f);
        weatherData.setMeasurements(27, 45, 27.1f);
        weatherData.setMeasurements(35, 40, 20.9f);

    }

}
