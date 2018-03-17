package main.java.strategyPattern.DuckProject;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
