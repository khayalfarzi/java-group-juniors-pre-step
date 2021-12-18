package az.ikt_lab.juniors.models;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Byte iq;
    private String[][] schedule;
    private Family family;

    public Human() {
        System.out.println(String.format("Object's type: %s", Human.this));
    }

    public Human(String name) {
        this.name = name;
        System.out.println(String.format("Object's type: %s", Human.this));
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        System.out.println(String.format("Object's type: %s", Human.this));

    }

    public Human(String name, String surname, Integer year, Byte iq, String[][] schedule) {
        this(name, surname, year);
        this.iq = iq;
        this.schedule = schedule;
        System.out.println(String.format("Object's type: %s", Human.this));
    }

    public Human(String name, String surname, Integer year, Byte iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
        System.out.println(String.format("Object type: %s", Human.this));

    }

    static {
        System.out.println(String.format("Name of %s :)", Human.class));
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

    public Byte getIq() {
        return iq;
    }

    public void setIq(Byte iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(year, human.year) &&
                Objects.equals(iq, human.iq) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, schedule=%s}",
                name, surname, year, iq, Arrays.toString(schedule));
    }
}
