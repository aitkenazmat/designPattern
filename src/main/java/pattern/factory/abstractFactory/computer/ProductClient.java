package pattern.factory.abstractFactory.computer;

import pattern.factory.abstractFactory.computer.factory.MakeFactory;
import pattern.factory.abstractFactory.computer.impl.Computer;

public class ProductClient {
    MakeFactory factory;
    public ProductClient(MakeFactory factory) {
        this.factory = factory;
    }
    public void buy() {
        Computer laptop = factory.createLaptop();
        Computer stationaryComputer = factory.createStationaryComputer();
        Computer netBook = factory.createNetBook();

        laptop.buy();
        stationaryComputer.buy();
        netBook.buy();
    }
}
