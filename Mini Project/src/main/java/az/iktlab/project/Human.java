package az.iktlab.project;

import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private Short year;
    private Byte iq;
    private Pet pet;
    private String [][] schedule;
    public Human() {
    }

    public Human(String name, String surname, Short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Short year, Byte iq, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (getName() != null ? !getName().equals(human.getName()) : human.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(human.getSurname()) : human.getSurname() != null) return false;
        if (getYear() != null ? !getYear().equals(human.getYear()) : human.getYear() != null) return false;
        if (getIq() != null ? !getIq().equals(human.getIq()) : human.getIq() != null) return false;
        if (getPet() != null ? !getPet().equals(human.getPet()) : human.getPet() != null) return false;
        return Arrays.deepEquals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        result = 31 * result + (getIq() != null ? getIq().hashCode() : 0);
        result = 31 * result + (getPet() != null ? getPet().hashCode() : 0);
        result = 31 * result + Arrays.deepHashCode(getSchedule());
        return result;
    }
    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, pet=%s}",
                this.name,
                this.surname,
                this.year,
                this.iq,
                this.pet);
    }
}
