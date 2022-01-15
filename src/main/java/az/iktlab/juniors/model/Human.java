package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private LocalDate date;
    private Byte iq;
    private Map<DayOfWeek,String> schedule;
    private Pet pet;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public Human(String name, String surname, LocalDate date, Byte iq,Map<DayOfWeek,String> schedule){
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.iq = Validator.isTrueForIqOrForTrickLevel(iq) ? iq : 0;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Byte getIq() {
        return iq;
    }

    public void setIq(Byte iq) {
        this.iq = Validator.isTrueForIqOrForTrickLevel(iq) ? iq : 0;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Map<DayOfWeek,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek,String> schedule) {
        this.schedule = schedule;
    }

    public void  greetPet(){
        System.out.printf("Hello, %s%n",
                Validator.isNull(getPet().getNickname()) ? getPet().getNickname() : "No Information!");
    }

    @Override
    protected void finalize() {
        System.out.println("Closed Human in the finalizer");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(date, human.date) && Objects.equals(iq, human.iq) && Objects.equals(schedule, human.schedule) && Objects.equals(pet, human.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, date, iq, schedule, pet);
    }

    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%s, iq=%s, schedule = %s}",
                Validator.isNull(getName()) ? getName() : "(No information)",
                Validator.isNull(getSurname()) ? getSurname() : "(No information)",
                Validator.isNull(getDate()) ? getDate() : "(No information)",
                getIq(),
                Validator.isNull(getSchedule()) ?
                        getSchedule() : "(No information)");
    }
}