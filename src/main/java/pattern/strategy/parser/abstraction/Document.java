package pattern.strategy.parser.abstraction;

import pattern.strategy.parser.impl.Parser;

public abstract class Document {

    private Parser parser;

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void performUnload(){
        parser.parse();
    }

}
