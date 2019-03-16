package pattern.adapter.example1;

public class Client {
    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        Object key = chief.makeDinner();
    }
}
