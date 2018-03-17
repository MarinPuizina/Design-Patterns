package main.java.strategyPattern.DuckProject;

public class FlyWithwings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }

}
