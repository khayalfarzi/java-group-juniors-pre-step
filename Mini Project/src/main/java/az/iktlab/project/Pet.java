package az.iktlab.project;

import java.util.Arrays;
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public void eat(){
        System.out.println ("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am-%s. I miss you!%n",getNickname());
    }
    public void foul(){
        System.out.println ("I need to cover it up");
    }

    public Pet() {
    }
    public Pet(String species,
               String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species,
               String nickname,
               int age,
               int trickLevel,
               String[] habits) {

        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=[%s]}",
                this.species,this.nickname,this.age,this.trickLevel, Arrays.toString(this.habits));
    }

}
