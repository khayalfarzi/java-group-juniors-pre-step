package az.iktlab.juniors;

import az.iktlab.juniors.model.*;
import az.iktlab.juniors.util.Validator;

import java.time.LocalDate;
import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        Random rand = new Random();

        Pet dog = new Dog();
        dog.setSpecies(Species.DOG);
        Pet cat = new DomesticCat();
        cat.setSpecies(Species.CAT);
        cat.setNickname("Milo");
        cat.setAge((short)2);
        cat.setTrickLevel((byte)60);
        cat.setHabits(new String[]{"eat, drink, sleep"});

        Human grandMother = new Human();
        grandMother.setName("Emma");
        grandMother.setSurname("Emerson");
        grandMother.setDate(LocalDate.parse("1945-12-20"));
        grandMother.setIq((byte)100);

        Human mother = new Human("Teresa","Butler",LocalDate.parse("1978-02-15"));
        mother.setIq((byte)60);
        Human father = new Human("Peter","Butler",LocalDate.parse("1972-06-07"));
        father.setIq((byte)95);

        Human boy = new Human("Carlos","Butler",LocalDate.parse("1999-11-30"),(byte)80, new String[][]{
                        {DayOfWeek.SATURDAY.getName(),"eat"},
                        {DayOfWeek.SUNDAY.getName(),"drink"},
                        {DayOfWeek.MONDAY.getName(),"sleep"}
        });

        Human girl = new Human("Amelia","Butler",LocalDate.parse("2000-01-01"),(byte)60,new String[][]{{DayOfWeek.MONDAY.getName(),"Sleep"}});

        Family family = new Family();
        family.setMother(mother);
        family.setFather(father);
        family.setChildren(new Human[]{boy});
        family.setPet(dog);

        System.out.println(dog);
        dog.eat();
        dog.respond();
        ((Dog)dog).foul();
        System.out.println(cat);
        System.out.println("-------------------------------------------------------------");
        System.out.println(boy);
        System.out.println("-------------------------------------------------------------");
        System.out.println(family);
        family.describePet();
        boolean feedIsTime = family.isFeedTime((Validator.isNull(family.getPet().getTrickLevel()) ?
                family.getPet().getTrickLevel() : 0) > rand.nextInt());

        System.out.println(family.addChild(girl));
        System.out.println("After add :%n" + family);

        family.deleteChild(0);
        System.out.println(family);
        System.out.println("*******************************************");
        family.deleteChild(girl);
        System.out.println(family);
        System.out.println("---------------------------------------------------");
        family.bornChild();
        System.out.println(family);

    }
}
