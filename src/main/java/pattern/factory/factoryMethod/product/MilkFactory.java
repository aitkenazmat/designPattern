package pattern.factory.factoryMethod.product;

public class MilkFactory implements ProductFactory {
    public Product createProduct() {
        return new Milk();
    }
}
