package main.java.strategyPattern.DuckProject;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!?");
    }
}
