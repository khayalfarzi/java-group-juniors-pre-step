package com.happy.family;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Human {
    private Human mother;
    private Human father;
    private Pet pet;

    private String name;
    private String surname;
    private LocalDateTime year;
    private int iqLevel;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, LocalDateTime dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.year = dateOfBirth;
    }

    public Human(String name, String surname, LocalDateTime dateOfBirth, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = dateOfBirth;
        this.father = father;
        this.mother = mother;
    }

    public Human(Human mother, Human father,
                 Pet pet, String name,
                 String surname, LocalDateTime year,
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

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        String petLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        String message = "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + ", he is " + petLevel;
        System.out.println(message + petLevel);
    }

    @Override
    public String toString() {
        return "Human{" + "mother=" + mother + ", father=" + father +
                pet + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", year=" + year +
                ", iqLevel=" + iqLevel + ", schedule=" + Arrays.toString(schedule) + '}';
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

    public LocalDateTime getYear() {
        return year;
    }

    public void setYear(LocalDateTime year) {
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
}

