package pattern.decorator.starbucks;

import pattern.decorator.starbucks.decorator.Mocha;
import pattern.decorator.starbucks.decorator.Soy;
import pattern.decorator.starbucks.decorator.Whip;

public class Run {
    public static void main(String[] args) {

        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription() + " $" + bevarage.coast());

        Bevarage bevarage1 = new DarkRoast();
        bevarage1 = new Mocha(bevarage1);
        bevarage1 = new Mocha(bevarage1);
        bevarage1 = new Whip(bevarage1);

        System.out.println(bevarage1.getDescription() + " $" + bevarage1.coast());

        Bevarage bevarage2 = new HouseBlend();
        bevarage2 = new Soy(bevarage2);
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " $" + bevarage2.coast());



    }
}
