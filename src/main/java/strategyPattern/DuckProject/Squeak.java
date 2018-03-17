package main.java.strategyPattern.DuckProject;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("main.java.strategyPattern.DuckProject.Squeak");
    }

}
