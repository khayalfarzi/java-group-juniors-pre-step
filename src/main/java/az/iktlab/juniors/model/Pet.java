package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {

    private Species species;
    private String nickname;
    private Short age;
    private Byte trickLevel;
    private Set<String> habits;

    {
        species = Species.UNKNOWN;
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
        this.trickLevel = Validator.isTrueForIqOrForTrickLevel(trickLevel) ? trickLevel : null;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public abstract void respond();

    public void eat() {
        System.out.println("I am eating.");
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
        return species == pet.species && Objects.equals(nickname, pet.nickname) && Objects.equals(age, pet.age) && Objects.equals(trickLevel, pet.trickLevel) && Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, habits);
    }

    @Override
    public String toString()
    {
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s,"
                        .concat("canFly=%s, numberOfLegs=%s ,hasFur=%s, habits=%s}"),
                Validator.isNull(getSpecies()) ? getSpecies() : "No Information",
                Validator.isNull(getNickname()) ? getNickname() : "No Information!",
                Validator.isNull(getAge()) ? getAge() : "No Information!",
                Validator.isNull(getTrickLevel()) ? getTrickLevel() : "No Information!",
                species.isCanFly(),
                species.getNumberOfLegs(),
                species.isHasFur(),
                Validator.isNull(getHabits()) ?
                        getHabits(): "No Information!");
    }

}
