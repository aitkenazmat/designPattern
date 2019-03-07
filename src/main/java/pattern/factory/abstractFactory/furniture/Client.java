package pattern.factory.abstractFactory.furniture;

import pattern.factory.abstractFactory.furniture.factory.MakeFurnitureFactory;
import pattern.factory.abstractFactory.furniture.impl.Chair;
import pattern.factory.abstractFactory.furniture.impl.Sofa;

public class Client {
    MakeFurnitureFactory makeFurnitureFactory;

    public Client(MakeFurnitureFactory makeFurnitureFactory) {
        this.makeFurnitureFactory = makeFurnitureFactory;
    }

    public Chair getChair(){
        Chair chair = makeFurnitureFactory.createChair();
        chair.method1();
        return chair;
    }

    public Sofa getSofa(){
        Sofa sofa = makeFurnitureFactory.createSofa();
        sofa.method();
        return sofa;
    }
}
