package main.strategy.DuckProject;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithwings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }

}
