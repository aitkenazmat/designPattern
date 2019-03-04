package pattern.decorator.notifier;

public class Run {
    public static void main(String[] args) {
        Notifier notifier = new MailSender();
        notifier.send("we we we", "aza");

        System.out.println("---------------------------------------");

        Notifier notifier1 = new SmsDecorator(new MailSender());
        notifier1.send("","");

        System.out.println("---------------------------------------");

        Notifier notifier2 = new FacebookDecarator(new SmsDecorator(new MailSender()));
        notifier2.send("","");
    }
}
