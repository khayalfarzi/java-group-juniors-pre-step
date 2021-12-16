package com.sabirsabirli;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int dateOfBirth;
    int iqLevel;
    Pet pet;
    Human mother;
    Human father;
    String[][] nonWorkingActs;

    public Human() {

    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iqLevel, Pet pet, Human mother, Human father, String[][] nonWorkingActs) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        if (iqLevel >= 0 && iqLevel <= 100)
            this.iqLevel = iqLevel;
        else System.out.println("IQ level must be in the range [0-100]");
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.nonWorkingActs = nonWorkingActs;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        System.out.printf("I have a %s , he is %d years old,", pet.nickname, pet.age);
        System.out.println(pet.trickLevel > 50 ? " he is very sly" : " almost not sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name +
                ", surname='" + surname +
                ", dateOfBirth=" + dateOfBirth +
                ", iqLevel=" + iqLevel +
                ", " + '\n' + "mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }

}
