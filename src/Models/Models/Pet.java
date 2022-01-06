package az.baku.Models;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private String[] habits;

    public Pet(Species species, String nickname, byte age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public byte getAge() {
        return age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Null pointers of Pet were collected by garbage collector");
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
