package pattern.factory.abstractFactory.furniture.factory;

import pattern.factory.abstractFactory.furniture.impl.Chair;
import pattern.factory.abstractFactory.furniture.impl.ItalyChair;
import pattern.factory.abstractFactory.furniture.impl.ItalySofa;
import pattern.factory.abstractFactory.furniture.impl.Sofa;

public class ItalyFurnitureFactory implements MakeFurnitureFactory {
    public Chair createChair() {
        return new ItalyChair();
    }

    public Sofa createSofa() {
        return new ItalySofa();
    }
}
