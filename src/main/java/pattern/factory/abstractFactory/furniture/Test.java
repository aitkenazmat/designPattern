package pattern.factory.abstractFactory.furniture;

import pattern.factory.abstractFactory.furniture.factory.ItalyFurnitureFactory;
import pattern.factory.abstractFactory.furniture.factory.RussianFurnitureFactory;

public class Test {
    public static void main(String[] args) {
        //Client client = new Client(new ItalyFurnitureFactory());
        Client client = new Client(new RussianFurnitureFactory());
        client.getChair();
        client.getSofa();
    }
}
