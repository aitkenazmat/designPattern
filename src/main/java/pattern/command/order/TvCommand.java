package pattern.command.order;


public class TvCommand implements Command {
    TV tv;

    public TvCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }
}
