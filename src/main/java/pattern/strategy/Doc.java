package pattern.strategy;

public abstract class Doc {

    private String name;
    private String num;
    private ParserStrategy parserStrategy;


    public Doc() {
    }

    public Doc(String name, String num, ParserStrategy parserStrategy) {
        this.name = name;
        this.num = num;
        this.parserStrategy = parserStrategy;
    }

    public ParserStrategy getParserStrategy() {
        return parserStrategy;
    }

    public void setParserStrategy(ParserStrategy parserStrategy) {
        this.parserStrategy = parserStrategy;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    void perfomParser(){
        this.parserStrategy.parse();
    }
}
