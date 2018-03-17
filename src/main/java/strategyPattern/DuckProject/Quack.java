package main.java.strategyPattern.DuckProject;

public class Quack implements  QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack.");
    }

}
