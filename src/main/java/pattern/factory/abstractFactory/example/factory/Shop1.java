package pattern.factory.abstractFactory.example.factory;

import pattern.factory.abstractFactory.example.impl.AbstractPhone;
import pattern.factory.abstractFactory.example.impl.AbstractWatch;
import pattern.factory.abstractFactory.example.impl.NokiaPhone;
import pattern.factory.abstractFactory.example.impl.QuartzWatch;

public class Shop1 implements AbstractFactory {
    public AbstractWatch createWatch() {
        return new QuartzWatch();
    }

    public AbstractPhone createPhone() {
        return new NokiaPhone();
    }
}
