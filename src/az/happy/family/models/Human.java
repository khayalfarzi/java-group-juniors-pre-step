package az.happy.family.models;

import java.util.Random;

public class Human {
    private Human mother;
    private Human father;
    private Pet pet;

    private String name;
    private String surname;
    private int year;
    //default IQ level is 85
    private int iqLevel = 85;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.year = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = dateOfBirth;
        this.father = father;
        this.mother = mother;
    }

    public Human(Human mother, Human father,
                 Pet pet, String name,
                 String surname, int year,
                 int iqLevel, String[][] schedule) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iqLevel = iqLevel;
        this.schedule = schedule;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    public void greetPet() {
        System.out.printf("Hello, %s %n", pet.getNickname());
    }

    public void describePet() {
        String petLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %d, he is %s%n", pet.getSpecies(), pet.getAge(), petLevel);
    }

    @Override
    public String toString() {
        if (mother == null || father == null || pet == null) {
            return String.format("Human{name=%s, surname=%s, year=%d, iq=%d}",
                    name, surname, year, iqLevel);
        }
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, mother=%s, father=%s, pet=%s}",
                name, surname, year, iqLevel, mother.name, father.name, pet);
    }

    public boolean feedPet(boolean isFeedTime) {
        if (isFeedTime) {
            System.out.printf("Hm... I will feed Jack's %s", pet.getNickname());
            return true;
        } else {
            Random random = new Random();
            int levelComparison = random.nextInt(100);
            if (pet.getTrickLevel() > levelComparison)
                return feedPet(true);
        }
        System.out.println("I think Jack is not hungry.");
        return false;
    }
}

