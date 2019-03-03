package pattern.factory.factoryMethod.product;

public class BreadFactory implements ProductFactory {
    public Product createProduct() {
        return new Bread();
    }
}
