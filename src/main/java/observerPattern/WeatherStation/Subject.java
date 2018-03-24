package main.java.observerPattern.WeatherStation;

public interface Subject  {

    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

}
