package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private Species species;
    private String nickname;
    private Short age;
    private Byte trickLevel;
    private String[] habits;

    /**
     * static {
        System.out.printf("Class name: %s%n",Pet.class );
     }
     {
        System.out.printf("Object type: %s%n",Pet.this);
     }
     */

    public Pet(){ }

    //All fields constructor
    public Pet(Species species, String nickname, Short age, Byte trickLevel, String[] habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = Validator.isTrueForTrickLevel(trickLevel) ? trickLevel : null;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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
        this.trickLevel = Validator.isTrueForTrickLevel(trickLevel) ? trickLevel : null;
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
        System.out.printf("Hello, owner. I am - %s. I miss you!%n",
                Validator.isNull(getNickname()) ? getNickname() : "No Information!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Closed Pet in the finalizer");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) &&
                Objects.equals(age, pet.age) && Objects.equals(trickLevel, pet.trickLevel) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = (31 * result) + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString()
    {
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s,"
                        .concat("canFly=%s, numberOfLegs=%s ,hasFur=%s, habits=%s}"),
                Validator.isNull(getSpecies()) ? getSpecies() : "No Information!",
                Validator.isNull(getNickname()) ? getNickname() : "No Information!",
                Validator.isNull(getAge()) ? getAge() : "No Information!",
                Validator.isNull(getTrickLevel()) ? getTrickLevel() : "No Information!",
                species.isCanFly(),
                species.getNumberOfLegs(),
                species.isHasFur(),
                Validator.isNull(Arrays.deepToString(getHabits())) ?
                        Arrays.deepToString(getHabits()): "No Information!");
    }

}
