package pattern.decorator.notifier;

public class FacebookDecarator extends DecoratorSender {



    public FacebookDecarator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public Message send(String text, String author) {
        System.out.println("facebook send ..................");
        return super.send(text, author);
    }
}
