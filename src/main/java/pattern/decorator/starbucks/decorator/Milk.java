package pattern.decorator.starbucks.decorator;

import pattern.decorator.starbucks.Bevarage;
import pattern.decorator.starbucks.Decorator;

public class Milk extends Decorator {
    private Bevarage bevarage;

    public Milk(Bevarage bevarage) {
        this.bevarage = bevarage;
    }


    public String getDescription() {
        return bevarage.getDescription() + ", Milk";
    }

    public double coast() {
        return 0.1 + bevarage.coast();
    }
}
