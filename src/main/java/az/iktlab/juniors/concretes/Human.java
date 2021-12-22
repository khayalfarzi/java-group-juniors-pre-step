package az.iktlab.juniors.concretes;

import az.iktlab.juniors.abstracts.Entity;
import az.iktlab.juniors.utils.ExceptionUtil;
import az.iktlab.juniors.utils.UtilClass;

import java.util.Arrays;

public class Human implements Entity {

    private String name;
    private String surname;
    private Integer year;
    private Byte iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, Integer year) throws ExceptionUtil {
        this.name = name;
        this.surname = surname;
        if (year < 0) {
            throw new ExceptionUtil("Year must not be a negative number");
        }
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Human mother, Human father) throws ExceptionUtil {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, Integer year, Byte iq, Pet pet, Human mother, Human father, String[][] schedule) throws ExceptionUtil {
        this(name, surname, year, father, mother);
        if (iq < 1 || iq > 100) {
            throw new ExceptionUtil("IQ must be between 1 to 100");
        }
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) throws ExceptionUtil {
        if (year < 0) {
            throw new ExceptionUtil("Year must not be a negative number");
        }
        this.year = year;
    }

    public Byte getIq() {
        return iq;
    }

    public void setIq(Byte iq) throws ExceptionUtil {
        if (iq < 1 || iq > 100) {
            throw new ExceptionUtil("IQ must be between 1 to 100");
        }
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet() {
        String result = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %d years old, he is %s", pet.getSpecies(), pet.getAge(), result);
    }

    public boolean feedPet(boolean isFeedingTime, Byte trickLevel) {
        return UtilClass.feedPet(isFeedingTime, trickLevel, pet.getNickname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (year != null ? !year.equals(human.year) : human.year != null) return false;
        if (iq != null ? !iq.equals(human.iq) : human.iq != null) return false;
        if (pet != null ? !pet.equals(human.pet) : human.pet != null) return false;
        if (mother != null ? !mother.equals(human.mother) : human.mother != null) return false;
        if (father != null ? !father.equals(human.father) : human.father != null) return false;
        return Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (iq != null ? iq.hashCode() : 0);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + (father != null ? father.hashCode() : 0);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, pet=%s, mother=%s, father=%s, schedule=%s}",
                name, surname, year, iq, pet, mother, father, Arrays.toString(schedule));
    }
}
