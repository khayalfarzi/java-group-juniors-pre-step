package az.iktlab.juniors;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;

    }

    public void setTricklevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public int getTrickLeveltrickLevel() {
        return trickLevel;
    }


    void eat() {
        System.out.println("'I am eating");
    }

    void respond() {
        System.out.println("'Hello, owner. I am -" + nickname + " I miss you!')");
    }

    void foul() {
        System.out.println("I need to cover it up");
    }

    //    dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}
    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname,
                age, trickLevel, Arrays.toString(habits));
    }
}
