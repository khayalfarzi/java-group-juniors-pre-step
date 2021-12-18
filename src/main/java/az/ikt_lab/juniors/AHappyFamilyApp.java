package az.ikt_lab.juniors;

import az.ikt_lab.juniors.models.Family;
import az.ikt_lab.juniors.models.Human;
import az.ikt_lab.juniors.models.Pet;

public class AHappyFamilyApp {
    public static void main(String[] args) {

        Human emptyHuman = new Human();
        Human mark = new Human("Mark", "Zuckerberg", 37);
        Pet pet = new Pet("Dog", "Kak", 19, 43, new String[]{"aa"});

        Family family1 = new Family(new Human("Mami"), new Human("Papi"),
                new Human[]{new Human("Mahmud", "Mahmudlu", 2009,
                        (byte)1, new String[][]{{"a"}, {"a"}}, new Family()),
                           new Human("Totu")}, new Pet("Doggy"));
        System.out.println(family1);
    }
}