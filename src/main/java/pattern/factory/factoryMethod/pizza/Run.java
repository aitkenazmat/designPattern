package pattern.factory.factoryMethod.pizza;


public class Run {
    public static void main(String[] args) {
        PizzaStore nyStore = new ChicagoStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
