package pattern.strategy;

public class Run {

    public static void main(String[] args) {
        Doc doc = new PdfDoc("55","999",new PdfParser());
        doc.perfomParser();

        Doc doc1 = new WordDoc("55","999",new WordParser());
        doc1.perfomParser();
    }
}
