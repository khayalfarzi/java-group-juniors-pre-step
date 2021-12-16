package com.company.main;

import java.util.Arrays;
import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father) {
        this(name, surname, year);
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, iq, pet, mother, father);
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

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println(String.format("Hello, %s", pet.getNickname()));
    }

    public void describePet() {
        System.out.println(String.format("I have a %s, it is %d years old, it is %s",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly"));
    }

    public boolean feedPet(boolean isFeedingTime, Integer trickLevel) {
        if (isFeedingTime) {
            System.out.println("Hm... I'll feed " + pet.getNickname());
            return true;
        } else {
            Random rand = new Random();
            int num = rand.nextInt(101);
            if (trickLevel > num) {
                System.out.println("Hm... I'll feed " + pet.getNickname());
                return true;
            } else {
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, pet=%s, mother=%s, father=%s, schedule=%s}",
                name, surname, year, iq, pet, mother, father, Arrays.toString(schedule));
    }
}
