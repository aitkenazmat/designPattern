package pattern.factory.factoryMethod.product;


public class Run {
    public static void main(String[] args) {
        //создаем фабрику
        ProductFactory milkFactory = new MilkFactory();
        //создаем продукт - зависит от фабрики
        Product milk = milkFactory.createProduct();
        milk.buy();

        ProductFactory breadFactory = new BreadFactory();
        Product bread = breadFactory.createProduct();
        bread.buy();
    }
}
