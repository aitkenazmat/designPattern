package pattern.strategy.duck;

public class FlyRockerPowered implements FlyBehavior {
    public void fly() {
        System.out.println("Im flying with rocket");
    }
}
