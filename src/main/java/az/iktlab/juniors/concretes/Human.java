package az.iktlab.juniors.concretes;

import az.iktlab.juniors.abstracts.Entity;
import az.iktlab.juniors.utils.ExceptionUtil;

import java.util.Arrays;

public class Human implements Entity {

    private String name;
    private String surname;
    private Integer year;
    private Byte iq;
    private String[][] schedule;
    private boolean isMarried;

    static {
        System.out.printf("Class is being loaded %s\n", Human.class);
    }

    {
        System.out.printf("Class is being loaded %s\n", this.getClass().getName());
    }

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

    public Human(String name, String surname, Integer year, Byte iq, String[][] schedule) throws ExceptionUtil {
        this(name, surname, year);
        if (iq < 1 || iq > 100) {
            throw new ExceptionUtil("IQ must be between 1 to 100");
        }
        this.iq = iq;
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (isMarried != human.isMarried) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (year != null ? !year.equals(human.year) : human.year != null) return false;
        if (iq != null ? !iq.equals(human.iq) : human.iq != null) return false;
        return Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (iq != null ? iq.hashCode() : 0);
        result = 31 * result + Arrays.deepHashCode(schedule);
        result = 31 * result + (isMarried ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, schedule=%s, isMarried=%s}",
                name, surname, year, iq, Arrays.toString(schedule), isMarried);
    }
}
