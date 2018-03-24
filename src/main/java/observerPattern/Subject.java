package main.java.observerPattern;

public interface Subject  {

    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

}