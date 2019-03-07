package pattern.factory.abstractFactory.furniture.factory;

import pattern.factory.abstractFactory.furniture.impl.Chair;
import pattern.factory.abstractFactory.furniture.impl.RussianChair;
import pattern.factory.abstractFactory.furniture.impl.RussianSofa;
import pattern.factory.abstractFactory.furniture.impl.Sofa;

public class RussianFurnitureFactory implements MakeFurnitureFactory {
    public Chair createChair() {
        return new RussianChair();
    }
    public Sofa createSofa() {
        return new RussianSofa();
    }
}
