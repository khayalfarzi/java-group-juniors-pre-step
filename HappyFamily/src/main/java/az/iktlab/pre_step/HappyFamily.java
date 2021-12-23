package az.iktlab.pre_step;

import az.iktlab.pre_step.modul.Family;
import az.iktlab.pre_step.modul.Human;
import az.iktlab.pre_step.modul.Pet;

import java.util.Scanner;

public class HappyFamily {
    public static void main(String[] args) {

        Human mother = new Human();
        mother.setName("Jane ");
        mother.setSurname("Karleone");
        mother.setYear(1957);

        Human father = new Human("Vito ", "Karleone", 1955);

        Pet dog = new Pet("dog","Rock", 5,(byte)75 , new String[]{"eat", "drink", "sleep"});

        Human child = new Human("Michael", "Karleone", 1977);

        Human brother = new Human("John", "Karleone", 1980);

        Human child1 = new Human("john", "karlone", 12);
        Human child2 = new Human("johnyy", "karlone", 9);

        Family family = new Family();
        family.setMother(mother);
        family.setFather(father);
        family.setChildren(new Human[]{child});
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(dog);

        System.out.println("**************Before delete child************");
        System.out.println(family.toString());

        family.deleteChild(0);
        System.out.println("**************After delete child************");
        System.out.println(family.toString());

        System.out.println(family.countOfFamily());

        System.out.println("****************Pet class functions*************************");
        dog.eat();
        dog.foul();
        dog.respond();
        System.out.println("***************************************************************");

        System.out.println("****************Family class functions*************************");
        family.describePet();
        family.greetPet();
        family.feedPet(false);
        System.out.println("***************************************************************");




    }
}
