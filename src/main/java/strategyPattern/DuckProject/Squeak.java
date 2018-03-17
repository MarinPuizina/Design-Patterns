package main.strategy.DuckProject;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("main.strategy.DuckProject.Squeak");
    }

}
