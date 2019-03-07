package pattern.command.order;


public class Run {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        Command tvCommand = new TvCommand(tv);
        Command radioCommand = new RadioCommand(radio);

        RemoteController remoteController =
                new RemoteController(tvCommand,radioCommand);

        remoteController.onTV();
        remoteController.onRadio();

        remoteController.offTV();
        remoteController.offRadio();
    }
}
