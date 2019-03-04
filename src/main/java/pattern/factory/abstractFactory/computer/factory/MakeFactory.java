package pattern.factory.abstractFactory.computer.factory;

import pattern.factory.abstractFactory.computer.impl.Computer;

public interface MakeFactory {
    Computer createStationaryComputer();
    Computer createLaptop();
    Computer createNetBook();
}
