package main.strategy;

import main.strategy.DuckProject.Duck;
import main.strategy.DuckProject.MallardDuck;
import main.strategy.RPG.Warrior;
import main.strategy.RPG.Character;

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
