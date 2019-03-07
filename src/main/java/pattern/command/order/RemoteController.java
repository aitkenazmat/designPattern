package pattern.command.order;

public class RemoteController {
    Command tvCommand;
    Command radioCommand;

    public RemoteController(Command tvCommand, Command radioCommand) {
        this.tvCommand = tvCommand;
        this.radioCommand = radioCommand;
    }

    public void onTV(){
        tvCommand.execute();
    }
    public void offTV(){
        tvCommand.execute();
    }

    public void onRadio(){
        radioCommand.execute();
    }
    public void offRadio(){
        radioCommand.execute();
    }

}
