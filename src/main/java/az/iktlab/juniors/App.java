package az.iktlab.juniors;


import az.iktlab.juniors.models.Family;
import az.iktlab.juniors.models.Human;
import az.iktlab.juniors.models.Pet;

import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        Random rand = new Random();

        Pet dog = new Pet("Dog","Paul",(short)2, (byte)30,new String[]{"eat, drink, sleep"});
        Pet cat = new Pet();
        cat.setSpecies("Cat");
        cat.setNickname("Milo");
        cat.setAge((short)2);
        cat.setTrickLevel((byte)60);
        cat.setHabits(new String[]{"eat, drink, sleep"});

        Human grandMother = new Human();
        grandMother.setName("Emma");
        grandMother.setSurname("Emerson");
        grandMother.setYear((short)1930);
        grandMother.setIq((byte)100);

        Human mother = new Human("Teresa","Butler",(short)1978);
        Human father = new Human("Peter","Butler",(short) 1974);

        Human boy = new Human("Carlos","Butler",(short)1999,(byte)80,
                new String[][]{{"eat"},{"drink"},{"sleep"}});
        Human girl = new Human("Amelia","Butler",(short)2000,(byte)60,new String[][]{{"nothing"}});

        Family family = new Family();
        family.setMother(mother);
        family.setFather(father);
        family.setChildren(new Human[]{boy});
        family.setPet(dog);

        System.out.println(dog);
        dog.eat();
        dog.respond();
        dog.foul();
        System.out.println("-------------------------------------------------------------");
        System.out.println(boy);
        System.out.println("-------------------------------------------------------------");
        System.out.println(family);
        family.greetPet();
        family.describePet();
        boolean feedIsTime = family.isFeedTime(family.getPet().getTrickLevel() > rand.nextInt());

        System.out.println(family.addChild(girl));
        System.out.println("after add : " + family);

        family.deleteChild(0);
        System.out.println(family);
        System.out.println("*******************************************");
        family.deleteChild(girl);
        System.out.println(family);

    }
}
