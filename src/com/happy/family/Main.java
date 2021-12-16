package com.happy.family;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Human family = new Human();
        Human father = new Human("Ata", "Ata", LocalDateTime.of(2018, 12, 15, 15, 1));
        family.setFather(father);
        Human mother = new Human("Ana", "Ana", LocalDateTime.of(2018, 12, 15, 15, 1));
        family.setMother(mother);

        Pet pet = new Pet("Dog", "Tom", 1, 54, new String[]{"eat", "sleep"});
        family.setPet(pet);
        System.out.println(family);
    }
}
