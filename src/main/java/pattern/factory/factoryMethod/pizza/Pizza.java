package pattern.factory.factoryMethod.pizza;


import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    void prepare(){
        System.out.println("Preparing " + name);
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake(){
        System.out.println("bake...");
    };
    void cut(){
        System.out.println("cut...");
    };
    void box(){
        System.out.println("box...");
    };

    public String getName() {
        return name;
    }
}
