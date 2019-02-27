package pattern.observer.example2;


import java.util.ArrayList;
import java.util.List;

//Сurrency - валюта
public class Сurrency implements Subject {
    private ArrayList subscribers;
    private float usd;
    private float eur;
    private float rub;

    public Сurrency() {
        this.subscribers = new ArrayList();
    }

    public void register(Observer observer) {
        subscribers.add(observer);
    }

    public void remove(Observer observer) {
        int i = subscribers.indexOf(observer);
        if (i>=0)
            subscribers.remove(i);
    }

    public void notifyObserver() {
        for (int i = 0; i < subscribers.size() ; i++) {
            Observer observer = (Observer) subscribers.get(i);
            observer.updateData(this.usd,this.eur,this.rub);
        }
    }

    public void getState(){
        notifyObserver();
    }

    public void setState(float usd,float eur,float rub){
        this.usd = usd;
        this.eur = eur;
        this.rub = rub;
        getState();
    }
}
