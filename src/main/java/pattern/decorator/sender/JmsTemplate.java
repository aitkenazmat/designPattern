package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public class JmsTemplate {

    void send(Message message) {
        System.out.println(String.format("message was sended. author is %s , text = %s ", message.getAuthor(),message.getText()));
    }
}
