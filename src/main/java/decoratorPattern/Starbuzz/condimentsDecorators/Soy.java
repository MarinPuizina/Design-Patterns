package main.java.decoratorPattern.Starbuzz.condimentsDecorators;

import main.java.decoratorPattern.Starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .19;
    }
}
