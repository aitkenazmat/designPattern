package pattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck malled = new ModelDuck();
        malled.performFly();
        malled.setFlyBehavior(new FlyRockerPowered());
        malled.performFly();
        malled.performQuack();
    }
}
