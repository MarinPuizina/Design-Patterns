package main.java.strategyPattern.RPG;

public class Warrior extends Character {

    public Warrior() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void info() {
        System.out.println("Warrior does..");
    }
}
