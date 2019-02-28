package pattern.decorator.starbucks.decorator;

import pattern.decorator.starbucks.Bevarage;
import pattern.decorator.starbucks.Decorator;

public class Soy extends Decorator {
    private Bevarage bevarage;

    public Soy(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    public String getDescription() {
        return bevarage.getDescription() + " , Soy";
    }

    public double coast() {
        return 0.50 + bevarage.coast();
    }
}
