package pattern.decorator.starbucks;

//Без кофеина
public class Decaf extends Bevarage {
    public Decaf() {
        description = "Decaf coffee";
    }

    public double coast() {
        return 3.8;
    }
}
