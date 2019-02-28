package pattern.decorator.sender;

import pattern.decorator.notifier.Message;

public class JdbcTemplate {

    void save(Message message) {
        System.out.println(String.format("message was added in Oracle DB. messages author is %s , text = %s",message.getAuthor(),message.getText()));
    }
}
