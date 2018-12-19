package pattern.strategy.person.abstration;

import pattern.strategy.person.implematation.BuilderBehavior;
import pattern.strategy.person.implematation.MusicianBehavior;
import pattern.strategy.person.implematation.ProgrammerBehavior;

public abstract class Person {

    private MusicianBehavior musicianBehavior;
    private ProgrammerBehavior programmerBehavior;
    private BuilderBehavior builderBehavior;


    public MusicianBehavior getMusicianBehavior() {
        return musicianBehavior;
    }

    public ProgrammerBehavior getProgrammerBehavior() {
        return programmerBehavior;
    }

    public BuilderBehavior getBuilderBehavior() {
        return builderBehavior;
    }

    public void setMusicianBehavior(MusicianBehavior musicianBehavior) {
        this.musicianBehavior = musicianBehavior;
    }

    public void setProgrammerBehavior(ProgrammerBehavior programmerBehavior) {
        this.programmerBehavior = programmerBehavior;
    }

    public void setBuilderBehavior(BuilderBehavior builderBehavior) {
        this.builderBehavior = builderBehavior;
    }

    public  void sleep(){
        System.out.println("each person sleep...");
    }
    public void eat(){
        System.out.println("each person eats.....");
    }

    public abstract void sayHello();
}
