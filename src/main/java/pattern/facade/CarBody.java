package pattern.facade;

/**
 * kuzov
 *
 */
public class CarBody {
    private boolean isReadyCarBody = false;
    private boolean isInstalledEngine = false;
    private boolean isInstalledElectro = false;
    private boolean isWarming= false;
    private boolean isSettingSeat= false;
    private boolean isMountingWheels = false;
    private  boolean isCarReady = false;


    public void setReadyCarBody(boolean readyCarBody) {
        isReadyCarBody = readyCarBody;
    }

    public boolean isCarReady() {
        return isCarReady;
    }

    //ustanovka dvigatelya
    public void engineInstallation(Engine engine) {
        if (this.isReadyCarBody) {
            System.out.println("the engine " + engine + " installed success");
            this.isInstalledEngine = true;
        } else {
            System.out.println("the car body is not ready for installation engine");
        }
    }

    //ustanovka electro oborudavanie itd
    public void electroInstallation(ElectricalAppliances electricalAppliances) {
        if (this.isInstalledEngine) {
            System.out.println("ther electro " + electricalAppliances + " success installation");
            this.isInstalledElectro = true;
        } else {
            System.out.println("elctro is not installed");
        }
    }


    //uteplenie mawiny
    public void warmingCar(){
        if (this.isInstalledElectro) {
            System.out.println("the car is warming");
            this.isWarming = true;
        } else {
            System.out.println("the car is not rady for warming");
        }
    }

    //ustanovka sidenii
    public void ustanovkaSeets(Seats  seats){
        if (isWarming) {
            System.out.println("kolesy ustanovleny");
            this.isSettingSeat = true;
        } else {
            System.out.println("the car not ready for setting seats");
        }
    }

    //ustano0vka koles
    public void mountingWheels(Wheels wheels){
        if (this.isSettingSeat) {
            System.out.println("mounting wheels is success");
            this.isMountingWheels = true;
            this.isCarReady = true;
        } else {
            System.out.println("the car is not ready for mounting wheels");
        }
    }
}
