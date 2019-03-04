package pattern.factory.abstractFactory.example.factory;

import pattern.factory.abstractFactory.example.impl.AbstractPhone;
import pattern.factory.abstractFactory.example.impl.AbstractWatch;

public class Shop2 implements AbstractFactory {
    public AbstractWatch createWatch() {
        return null;
    }

    public AbstractPhone createPhone() {
        return null;
    }
}
