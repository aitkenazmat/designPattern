package pattern.observer.example2;

public class HalykBank implements Observer {

    private float usd;
    private float eur;
    private float rub;

    private Subject subject;

    public HalykBank(Subject subject) {
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
        String text  = String.format("----Halyk bank-----\n USD = %f \n EUR = %f \n RUB = %f", this.usd,this.eur,this.rub);
        System.out.println(text);
        System.out.println("------------------------------------------------------------");

    }
}
