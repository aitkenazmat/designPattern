package pattern.factory.factoryMethod.pizza;


public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
            return null;
    }


}
