package pattern.decorator.notifier;

public interface Notifier {
    Message send(String text, String author);
}
