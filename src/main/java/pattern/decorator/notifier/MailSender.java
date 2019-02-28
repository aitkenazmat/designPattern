package pattern.decorator.notifier;

public class MailSender implements Notifier {
    public Message send(String text, String author) {

        System.out.println("mail send....");
        Message message = new Message(text, author);
        return message;
    }
}
