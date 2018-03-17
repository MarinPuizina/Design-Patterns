package main.strategy.RPG;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void performAttack() {
        weaponBehavior.attack();
    }

    abstract public void info();
}
