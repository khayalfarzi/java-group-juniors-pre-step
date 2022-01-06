package az.happy.family.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private int year;
    //default IQ level is 85
    private int iqLevel = 85;
    private String[][] schedule;

    static {
        System.out.printf("The class named=%s is loaded\n", Human.class.getSimpleName());
    }

    {
        System.out.printf("The object of class named=%s is loaded\n", Human.class.getSimpleName());
    }

    public Human() {
    }

    public Human(Family family, String name, String surname,
                 int year, int iqLevel, String[][] schedule) {
        this.family = family;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iqLevel = iqLevel;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.year = dateOfBirth;
    }


    public Human(String name,
                 String surname, int year,
                 int iqLevel, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iqLevel = iqLevel;
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
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
        return year == human.year
                && iqLevel == human.iqLevel
                && name.equals(human.name)
                && surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(family, name, surname, year, iqLevel);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, schedule=%s}",
                name, surname, year, iqLevel, Arrays.toString(schedule));
    }

    public void greetPet() {
        System.out.printf("Hello, %s %n", family.getPet().getNickname());
    }

    public void describePet() {
        String petLevel = family.getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %d, he is %s%n", family.getPet().getSpecies(), family.getPet().getAge(), petLevel);
    }

    public boolean feedPet(boolean isFeedTime) {
        if (isFeedTime) {
            System.out.printf("Hm... I will feed Jack's %s", family.getPet().getNickname());
            return true;
        } else {
            Random random = new Random();
            int levelComparison = random.nextInt(100);
            if (family.getPet().getTrickLevel() > levelComparison)
                return feedPet(true);
        }
        System.out.println("I think Jack is not hungry.");
        return false;
    }
}

