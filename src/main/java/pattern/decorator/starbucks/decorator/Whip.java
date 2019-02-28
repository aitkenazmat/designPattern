package pattern.decorator.starbucks.decorator;

import pattern.decorator.starbucks.Bevarage;
import pattern.decorator.starbucks.Decorator;

public class Whip extends Decorator {
    private Bevarage bevarage;

    public Whip(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    public String getDescription() {
        return bevarage.getDescription() + ", Whip";
    }

    public double coast() {
        return 0.5+ bevarage.coast();
    }
}
