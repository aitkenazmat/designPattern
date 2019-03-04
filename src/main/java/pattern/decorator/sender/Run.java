package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public class Run {
    public static void main(String[] args) {

        Message message = new Message("text","aza");

        //вариант  1 - просто отправить в очередь
        Sender sender = new ActiveMQ();
        sender.send(message);

        System.out.println("--------------------------------------------------");

        //варинат 2 - отправить в очередь и фиксировать в базе
        Sender sender1 = new OracleDecorator(new ActiveMQ());
        sender1.send(message);
    }
}
