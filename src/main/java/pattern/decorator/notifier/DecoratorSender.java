package pattern.decorator.notifier;

public abstract class DecoratorSender implements Notifier {
    Notifier notifier;

    public DecoratorSender(Notifier notifier) {
        this.notifier = notifier;
    }

    public Message send(String text, String author) {
        return notifier.send(text, author);
    }
}
