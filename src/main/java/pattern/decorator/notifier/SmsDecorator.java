package pattern.decorator.notifier;

public class SmsDecorator extends DecoratorSender {
    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public Message send(String text, String author) {

        System.out.println("sms send....");

        return super.send(text, author);
    }
}
