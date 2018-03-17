package main.java.strategyPattern.RPG;

public class BowBehavior implements WeaponBehavior {

    @Override
    public void attack() {
        System.out.println("Bow attack!");
    }

}
