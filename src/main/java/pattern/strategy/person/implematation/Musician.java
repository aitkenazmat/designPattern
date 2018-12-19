package pattern.strategy.person.implematation;

public class Musician implements MusicianBehavior {
    public void sing() {
        System.out.println("I'm singer .... ");
    }

    public void playGuitar() {
        System.out.println("I play guitar......");
    }
}
