package pattern.facade;


public class SimpleClient {
    public static void main(String[] args) {

        //1-й вариант без использование фасада
        CarBody carBody = new CarBody();
        carBody.setReadyCarBody(true);
        carBody.engineInstallation(new Engine());
        carBody.electroInstallation(new ElectricalAppliances());
        carBody.warmingCar();
        carBody.ustanovkaSeets(new Seats());
        carBody.mountingWheels(new Wheels());

        Car car = new Car();
        car.setMarka("Kia");
        car.setCarBody(carBody);
        car.sendTestDrive();
//-----------------------------------------------------------------------------------------------------------------
        //2- й вариант с  использование фасада
        InstallationCarFacade installationCarFacade = new InstallationCarFacade();
        installationCarFacade.installationCar();
    }
}
