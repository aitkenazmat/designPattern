package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public   class SenderDecorator implements Sender {
    protected Sender sender;
    public SenderDecorator(Sender sender) {
        this.sender = sender;
    }
    public void send(Message message) {
        sender.send(message);
    }
}
