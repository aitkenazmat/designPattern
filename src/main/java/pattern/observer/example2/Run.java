package pattern.observer.example2;



public class Run {
    public static void main(String[] args) {
        pattern.observer.example2.Сurrency сurrency = new Сurrency();

        HalykBank halykBank = new HalykBank(сurrency);
        KaspiBank kaspiBank = new KaspiBank(сurrency);

        сurrency.setState(370f,450f,6.8f);


    }
}
