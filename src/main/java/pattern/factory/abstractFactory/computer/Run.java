package pattern.factory.abstractFactory.computer;

import pattern.factory.abstractFactory.computer.factory.DellFactory;
import pattern.factory.abstractFactory.computer.factory.HpFactory;
import pattern.factory.abstractFactory.computer.factory.MakeFactory;
import pattern.factory.abstractFactory.computer.factory.SonyFactory;


public class Run {
    public static void main(String[] args) {
        ProductClient client = new ProductClient(getMakeFactory("dell"));
        client.buy();
    }

    private static MakeFactory getMakeFactory(String makeName){
        if (makeName.equals("hp"))
            return new HpFactory();
        else if (makeName.equals("dell"))
            return new DellFactory();
        else if (makeName.equals("sony"))
            return new SonyFactory();
        else
            return null;
    }
}
