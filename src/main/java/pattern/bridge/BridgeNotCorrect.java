package pattern.bridge;


public class BridgeNotCorrect {

    public static void main(String[] args) {
        Car car = new SedanCar();
        car.showDetails();
    }

    public static abstract class Car{
        abstract void  showDetails();
    }

    public static class SedanCar extends Car{

        void showDetails() {
            System.out.println("SedanCar car");
        }
    }

    public class HedgbackCar extends Car{
        void showDetails() {
            System.out.println("Hedgback car");
        }
    }

    public class CoupeCar extends Car{

        void showDetails() {
            System.out.println("CoupeCar car");
        }
    }


    public class KiaSedan extends SedanCar{

        @Override
        void showDetails() {
            System.out.println("Kia");
        }
    }
    public class SkodaSedan extends SedanCar{
        @Override
        void showDetails() {
            System.out.println("skoda");
        }
    }

    public class KiadHedgback extends HedgbackCar{
        @Override
        void showDetails() {
            System.out.println("Kia");
        }
    }

    public class SkodaHedgbeack extends HedgbackCar {
        @Override
        void showDetails() {
            System.out.println("skoda");
        }
    }
    class KiaCoupe extends CoupeCar{
        @Override
        void showDetails() {
            System.out.println("Kia");
        }
    }
    class skodaCoupe extends CoupeCar{
        @Override
        void showDetails() {
            System.out.println("skoda");
        }
    }


}


