package pattern.factory.abstractFactory.computer.factory;

import pattern.factory.abstractFactory.computer.impl.Computer;
import pattern.factory.abstractFactory.computer.impl.dell.DellLaptop;
import pattern.factory.abstractFactory.computer.impl.dell.DellNetbook;
import pattern.factory.abstractFactory.computer.impl.dell.DellStationaryComputer;


public class DellFactory implements MakeFactory {
    public Computer createStationaryComputer() {
        return new DellStationaryComputer();
    }

    public Computer createLaptop() {
        return new DellLaptop();
    }

    public Computer createNetBook() {
        return new DellNetbook();
    }
}
