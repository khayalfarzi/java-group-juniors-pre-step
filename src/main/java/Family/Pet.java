package Family;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickyLevel;
    private String[] habits;

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;

    }

    public Pet(String species, String nickname, int age, int trickyLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickyLevel = trickyLevel;
        this.habits = habits;
    }
    public Pet(){

    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Hello, owner.I am " + nickname + ".I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
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

    public int getTrickyLevel() {
        return trickyLevel;

    }

    public void setTrickyLevel(int trickyLevel) {
        if(trickyLevel>=1 && trickyLevel<=100){
            this.trickyLevel = trickyLevel;
        }else{
            System.out.println("Incorrect tricky level");
        }
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species + "{" + "nickname=" + nickname +  ", age=" + age + ", trickyLevel=" + trickyLevel +
                ", habits=" + Arrays.toString(habits) +  '}';
    }
}


