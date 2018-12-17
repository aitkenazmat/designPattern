package pattern.facade;


public class InstallationCarFacade {

    public void installationCar(){
        CarBody carBody = new CarBody();
        //1
        carBody.setReadyCarBody(true);
        //2
        carBody.engineInstallation(new Engine());
        //3
        carBody.electroInstallation(new ElectricalAppliances());
        //4
        carBody.warmingCar();
        //5
        carBody.ustanovkaSeets(new Seats());
        //6
        carBody.mountingWheels(new Wheels());

        Car car = new Car();
        car.setMarka("Kia");
        car.setCarBody(carBody);
        car.sendTestDrive();
    }
}
