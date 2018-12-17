package pattern.bridge;

public class BridgeCorrect {

    public static void main(String[] args) {

        Car car = new Sedan(new Skoda());
        car.showDetails();

    }

    public static abstract class Car{

        Make make;

        public Car(Make make) {
            this.make = make;
        }
        abstract void  showDetails();
    }

    public static class Sedan extends Car{
        public Sedan(Make make) {
            super(make);
        }

        void showDetails() {
            System.out.println("Sedan");
            make.setMake();
        }
    }

    public class Hachback extends Car{
        public Hachback(Make make) {
            super(make);
        }

        void showDetails() {
            System.out.println("Hachback");
            make.setMake();
        }
    }

    interface Make{
        void setMake();
    }

    static class Kia implements Make{
        public void setMake() {
            System.out.println("KIA");
        }
    }

    static class Skoda implements Make{
        public void setMake() {
            System.out.println("Skoda");
        }
    }
}


