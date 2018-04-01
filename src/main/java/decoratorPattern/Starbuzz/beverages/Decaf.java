package main.java.decoratorPattern.Starbuzz.beverages;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.65;
    }
}
