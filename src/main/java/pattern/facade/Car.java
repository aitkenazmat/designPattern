package pattern.facade;


public class Car {
    private String marka;
    private CarBody carBody;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void sendTestDrive() {

        if (this.carBody.isCarReady()) {
            System.out.println("test drive succes");
        } else {
            System.out.println("the car is not ready");
        }
    }
}
