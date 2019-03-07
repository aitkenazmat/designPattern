package pattern.singelton;

public class Singelton {
    static Singelton uniqueSingelton = new Singelton();

    private Singelton() {
    }

    public Singelton getInstance(){
        return uniqueSingelton;
    }
}
