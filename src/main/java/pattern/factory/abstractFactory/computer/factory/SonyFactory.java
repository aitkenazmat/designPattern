package pattern.factory.abstractFactory.computer.factory;

import pattern.factory.abstractFactory.computer.impl.Computer;
import pattern.factory.abstractFactory.computer.impl.sony.SonyLaptop;
import pattern.factory.abstractFactory.computer.impl.sony.SonyNetbook;
import pattern.factory.abstractFactory.computer.impl.sony.SonyStationaryComputer;

public class SonyFactory implements MakeFactory {
    public Computer createStationaryComputer() {
        return new SonyStationaryComputer();
    }

    public Computer createLaptop() {
        return new SonyLaptop();
    }

    public Computer createNetBook() {
        return new SonyNetbook();
    }
}
