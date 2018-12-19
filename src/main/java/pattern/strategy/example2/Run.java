package pattern.strategy.example2;

import pattern.strategy.example2.abstration.Musician;
import pattern.strategy.example2.abstration.Person;
import pattern.strategy.example2.implematation.BuilderNot;
import pattern.strategy.example2.implematation.Programmer;

public class Run {
    public static void main(String[] args) {

        Person person = new Musician();
        person.setBuilderBehavior(new BuilderNot());
        person.setMusicianBehavior(new pattern.strategy.example2.implematation.Musician());
        person.setProgrammerBehavior(new Programmer());
        person.sayHello();
        person.getBuilderBehavior().buildHouse();
        person.getMusicianBehavior().sing();
        person.getMusicianBehavior().playGuitar();

    }
}
