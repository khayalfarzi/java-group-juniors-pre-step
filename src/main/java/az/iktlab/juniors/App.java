package az.iktlab.juniors;


import az.iktlab.juniors.models.Human;
import az.iktlab.juniors.models.Pet;

import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        Pet dog = new Pet("Dog","Paul",2, 30,"eat, drink, sleep");


        Human grandMother = new Human();
        Human mother = new Human("Teresa","Butler",1978);
        Human father = new Human("Peter","Butler",1974,grandMother,null);

        Human boy = new Human("Carlos","Butler",1999,80,mother,father,dog);

        System.out.println(dog);
        dog.eat();
        dog.respond();
        dog.foul();
        System.out.println("-------------------------------------------------------------");
        System.out.println(boy);
        boy.greetPet();
        boy.describePet();
        boolean feedIsTime = boy.feedPet(boy.pet.trickLevel > rand.nextInt());
    }
}
