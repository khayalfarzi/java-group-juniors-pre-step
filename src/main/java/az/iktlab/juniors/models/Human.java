package az.iktlab.juniors.models;

import az.iktlab.juniors.util.Validator;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private Short year;
    private Byte iq;
    private String[][] schedule;
    private Validator validator;

    static {
        System.out.printf("Class name: %s%n",Human.class );
    }
    {
        System.out.printf("Object type: %s%n",Human.this);
    }

    public Human() {
    }

    public Human(String name, String surname, Short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Short year, Byte iq,String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = validator.isTrueForIq(iq) ? iq : 0;
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
        this.iq = validator.isTrueForIq(iq) ? iq : 0;
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
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) &&
                Objects.equals(year, human.year) && Objects.equals(iq, human.iq) &&
                Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, schedule = %s}",
                validator.isNull(getName()) ? getName() : "(No information)",
                validator.isNull(getSurname()) ? getSurname() : "(No information)",
                validator.isNull(getYear()) ? getYear() : "(No information)",
                getIq(),
                validator.isNull(Arrays.deepToString(getSchedule())) ? Arrays.deepToString(getSchedule()) : "(No information)");
    }
}
