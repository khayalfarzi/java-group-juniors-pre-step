package az.iktlab.juniors.models;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickname;
    private Short age;
    private Byte trickLevel;
    private String[] habits;

    public Pet(){
        {
            System.out.printf("Object type: %s%n",Pet.this);
        }
    }
    //All fields constructor
    public Pet(String species, String nickname, Short age, Byte trickLevel, String[] habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        {
            System.out.printf("Object type: %s%n",Pet.this);
        }
    }

    static {
        System.out.printf("Class name: %s%n",Pet.class );
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

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Byte trickLevel) {
        this.trickLevel = isTrueForTrickLevel(trickLevel);
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!%n",isNull(getNickname()));
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public Byte isTrueForTrickLevel(Byte trickLevel) {
        return trickLevel <= 100 && trickLevel >= 1 ? trickLevel : null;
    }

    public Object isNull(Object object){
        return object != null ? object : "( No information )";
    }

    @Override
    public String toString()
    {
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s, habits=%s}",
                isNull(getSpecies()),isNull(getNickname()),isNull(getAge()),
                isNull(getTrickLevel()),isNull(Arrays.toString(getHabits())));
    }

    @Override
    public boolean equals(Object obj) {
        Pet pet = (Pet)obj;

        if(pet == null) return false;
        return pet.getSpecies().equals(getSpecies()) && pet.getNickname().equals(getNickname())
                && pet.getAge().equals(getAge());
    }
}
