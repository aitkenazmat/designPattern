package pattern.factory.abstractFactory.furniture.factory;

import pattern.factory.abstractFactory.furniture.impl.Chair;
import pattern.factory.abstractFactory.furniture.impl.Sofa;

public interface MakeFurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
