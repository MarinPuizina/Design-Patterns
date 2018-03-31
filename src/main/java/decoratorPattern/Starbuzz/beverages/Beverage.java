package main.java.decoratorPattern.Starbuzz.beverages;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return  description;
    }

    public abstract double cost();

}
