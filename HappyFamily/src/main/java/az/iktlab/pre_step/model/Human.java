package az.iktlab.pre_step.modul;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Byte iq;
    private Pet pet;
    private Family family;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name,
                 String surname,
                 Integer year,
                 Byte iq,
                 Family family,
                 Pet pet,
                 String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human(String name,
                 String surname,
                 Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name,
                 String surname,
                 Integer year,
                 Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
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

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Byte getIq() {
        return iq;
    }

    public void setIq(Byte iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Object isNull(Object object){
        return object != null ? object : "empty";
    }

    @Override
    public String toString() {

        return String.format("Human{name='%s', surname='%s', year='%s', iq='%s',schedule='%s}",
                isNull(getName()),
                isNull(getSurname()),
                isNull(getYear()),
                isNull(getIq()),
                isNull(getSchedule()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname) && year.equals(human.year) &&
                iq.equals(human.iq) && pet.equals(human.pet) && family.equals(human.family) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}

