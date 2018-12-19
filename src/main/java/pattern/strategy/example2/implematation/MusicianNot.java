package pattern.strategy.example2.implematation;

public class MusicianNot implements MusicianBehavior {
    public void sing() {
        System.out.println("I'm not musician...");
    }

    public void playGuitar() {
        System.out.println("i dont play guitar....");
    }
}
