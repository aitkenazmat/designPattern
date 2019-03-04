package pattern.factory.abstractFactory.computer.factory;

import pattern.factory.abstractFactory.computer.impl.Computer;
import pattern.factory.abstractFactory.computer.impl.hp.HpLaptop;
import pattern.factory.abstractFactory.computer.impl.hp.HpNetbook;
import pattern.factory.abstractFactory.computer.impl.hp.HpStationaryComputer;

public class HpFactory implements MakeFactory {
    public Computer createStationaryComputer() {
        return new HpStationaryComputer();
    }

    public Computer createLaptop() {
        return new HpLaptop();
    }

    public Computer createNetBook() {
        return new HpNetbook();
    }
}
