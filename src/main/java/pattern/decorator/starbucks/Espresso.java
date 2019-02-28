package pattern.decorator.starbucks;

public class Espresso extends Bevarage {

    public Espresso() {
        description = "Espresso";
    }

    public double coast() {
        return 1.99;
    }
}
