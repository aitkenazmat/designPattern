package pattern.factory.abstractFactory.example.factory;

import pattern.factory.abstractFactory.example.impl.AbstractPhone;
import pattern.factory.abstractFactory.example.impl.AbstractWatch;

public interface AbstractFactory {
    AbstractWatch createWatch();
    AbstractPhone createPhone();
}
