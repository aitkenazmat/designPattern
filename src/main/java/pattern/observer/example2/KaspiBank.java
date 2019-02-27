package pattern.observer.example2;

public class KaspiBank implements Observer {

    private float usd;
    private float eur;
    private float rub;

    private Subject subject;

    public KaspiBank(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public void updateData(float usd, float eur, float rub) {
        this.eur = eur;
        this.rub = rub;
        this.usd = usd;
        display();
    }

    public void display(){
        String text  = String.format("----Kaspi bank-----\n USD = %f \n EUR = %f \n RUB = %f", this.usd,this.eur,this.rub);
        System.out.println(text);
        System.out.println("------------------------------------------------------------");
    }
}
