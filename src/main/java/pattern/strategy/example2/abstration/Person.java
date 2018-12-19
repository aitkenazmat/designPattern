package pattern.strategy.example2.abstration;

import pattern.strategy.example2.implematation.BuilderBehavior;
import pattern.strategy.example2.implematation.MusicianBehavior;
import pattern.strategy.example2.implematation.ProgrammerBehavior;

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
