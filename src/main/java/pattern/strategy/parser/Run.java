package pattern.strategy.parser;

import pattern.strategy.parser.abstraction.Document;
import pattern.strategy.parser.abstraction.Document1;
import pattern.strategy.parser.impl.JsonParser;


public class Run {

    public static void main(String[] args) {
        Document document = new Document1();
        document.setParser(new JsonParser());
        document.performUnload();
    }
}
