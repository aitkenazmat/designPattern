package pattern.command.order;

public class TV {
    public void on(){
        System.out.println("tv on...");
    }

    public void off(){
        System.out.println("tv off...");
    }

    public void changeChannel(int numChannel){
        System.out.println("channel was changed " + numChannel);
    }
}
