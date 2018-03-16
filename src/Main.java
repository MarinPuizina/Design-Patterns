import DuckProject.Duck;
import DuckProject.MallardDuck;
import RPG.Warrior;
import RPG.Character;

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
