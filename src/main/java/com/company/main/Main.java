package com.company.main;

public class Main {
    public static void main(String[] args) {
        Pet shabalid = new Pet("Cutdirnaqlilar", "Shabalid", 2, 66, null);
        Human human1 = new Human("Mark", "Anthony", 1972);
        Human mother = new Human("Mesmexanim", "Mashallahova", 1995);
        Human father = new Human("Shekerbey", "Dilotuyev", 2000);
        Human child = new Human("Qaragile", "Mashallohova", 2020, 165,
                shabalid, mother, father, null);
        System.out.println(human1);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        child.describePet();
        System.out.println(child.feedPet(false, shabalid.getTrickLevel()));
    }
}
