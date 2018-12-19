package pattern.strategy.person;

import pattern.strategy.person.abstration.Musician;
import pattern.strategy.person.abstration.Person;
import pattern.strategy.person.implematation.BuilderNot;
import pattern.strategy.person.implematation.Programmer;

public class Run {
    public static void main(String[] args) {

        Person person = new Musician();
        person.setBuilderBehavior(new BuilderNot());
        person.setMusicianBehavior(new pattern.strategy.person.implematation.Musician());
        person.setProgrammerBehavior(new Programmer());
        person.sayHello();
        person.getBuilderBehavior().buildHouse();
        person.getMusicianBehavior().sing();
        person.getMusicianBehavior().playGuitar();

    }
}
