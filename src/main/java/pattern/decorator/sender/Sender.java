package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public interface Sender  {
    void send(Message message);
}
