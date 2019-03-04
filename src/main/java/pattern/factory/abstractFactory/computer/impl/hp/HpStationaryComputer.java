package pattern.factory.abstractFactory.computer.impl.hp;

import pattern.factory.abstractFactory.computer.impl.Computer;

public class HpStationaryComputer implements Computer {
    public void buy() {
        System.out.println("I bought StationaryComputer hp ....");
    }
}
