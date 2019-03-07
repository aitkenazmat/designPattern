package pattern.command.order;


public class RadioCommand implements Command {
    Radio radio;

    public RadioCommand(Radio radio) {
        this.radio = radio;
    }

    public void execute() {
        radio.on();
    }
}
