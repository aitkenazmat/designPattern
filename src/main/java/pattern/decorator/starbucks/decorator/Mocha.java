package pattern.decorator.starbucks.decorator;

import pattern.decorator.starbucks.Bevarage;
import pattern.decorator.starbucks.Decorator;

public class Mocha extends Decorator {
    private Bevarage bevarage;

    public Mocha(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    public double coast() {
        return 0.20 + bevarage.coast();
    }
}
