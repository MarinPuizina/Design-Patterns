package main.java.strategyPattern;

import main.java.strategyPattern.DuckProject.Duck;
import main.java.strategyPattern.DuckProject.MallardDuck;
import main.java.strategyPattern.RPG.Warrior;
import main.java.strategyPattern.RPG.Character;

public class Main {

        public static void main(String[] args) {

                Character firstChar = new Warrior();

                firstChar.info();
                firstChar.performAttack();

                System.out.println();

                Duck mallard = new MallardDuck();

                mallard.display();
                mallard.performFly();
                mallard.performQuack();

        }

}
