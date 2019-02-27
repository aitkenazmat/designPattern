package pattern.observer.example1;

public class StatisticsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void unsubscribe(){
        subject.removeObserver(this);
    }

    public void display() {
        System.out.println("Statistics : " +  temperature + "F degrees and " + humidity + "% humidity");

    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
