package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public class ActiveMQ implements Sender {

    private JmsTemplate jmsTemplate;

    public ActiveMQ() {
        this.jmsTemplate = new JmsTemplate();
    }

    public void send(Message message) {
        jmsTemplate.send(message);
    }
}
