package pattern.decorator.sender;

import pattern.decorator.notifier.Message;


public class OracleDecorator extends SenderDecorator {
    private Message message;

    private JdbcTemplate jdbcTemplate;

    public OracleDecorator(Sender sender) {
        super(sender);
        jdbcTemplate = new JdbcTemplate();
    }

    @Override
    public void send(Message message) {
        jdbcTemplate.save(message);
        super.send(message);
    }
}
