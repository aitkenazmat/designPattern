package pattern.strategy.duck;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I cant fly");
    }
}
