package az.iktlab.juniors.models;


import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private Short year;
    private Byte iq;
    private String[][] schedule;

    public Human() {
        {
            System.out.printf("Object type: %s%n",Human.this);
        }
    }

    public Human(String name, String surname, Short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        {
            System.out.printf("Object type: %s%n",Human.this);
        }
    }

    public Human(String name, String surname, Short year, Byte iq,String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = isTrueForIq(iq);
        this.schedule = schedule;
        {
            System.out.printf("Object type: %s%n",Human.this);
        }
    }

    static {
        System.out.printf("Class name: %s%n",Human.class );
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
        this.iq = isTrueForIq(iq);
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Byte isTrueForIq(Byte iq) {
        return iq <= 100 && iq >= 1 ? iq : 0;
    }

    public Object isNull(Object object){
        return object != null ? object : "(No information)";
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, schedule = %s}",
                isNull(getName()), isNull(getSurname()), isNull(getYear()),
                getIq(), isNull(Arrays.deepToString(getSchedule())));
    }

    @Override
    public boolean equals(Object obj) {
        Human human = (Human) obj;
        return human.getName().equals(getName()) && human.getSurname().equals(getSurname())
                && Objects.equals(human.getYear(), getYear());
    }
}
