package pattern.facade;


public class SimpleClient {
    public static void main(String[] args) {

        //1-й вариант без использование фасада
//        CarBody carBody = new CarBody();
//        //1
//        carBody.setReadyCarBody(true);
//        //2
//        carBody.engineInstallation(new Engine());
//        //3
//        carBody.electroInstallation(new ElectricalAppliances());
//        //4
//        carBody.warmingCar();
//        //5
//        carBody.ustanovkaSeets(new Seats());
//        //6
//        carBody.mountingWheels(new Wheels());
//
//        Car car = new Car();
//        car.setMarka("Kia");
//        car.setCarBody(carBody);
//        car.sendTestDrive();

        //2- й вариант использование фасада
        InstallationCarFacade installationCarFacade = new InstallationCarFacade();
        installationCarFacade.installationCar();
    }
}
