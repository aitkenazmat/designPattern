package pattern.adapter.example1;

public class ChiefAdapter implements Chief {
    private Plumber plumber = new Plumber();

    @Override
    public Object makeBreakfast() {
        return plumber.getKey();
    }

    @Override
    public Object makeDinner() {
        return plumber.getPipe();
    }

    @Override
    public Object makeSupper() {
        return plumber.getScrewDriver();
    }
}
