package pattern.decorator.starbucks;

public abstract class Bevarage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double coast();
}
