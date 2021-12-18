package az.happy.family;

import az.happy.family.models.Human;
import az.happy.family.models.Pet;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Karen", "Zuckerberg", 1955);
        Human father = new Human("Edward", "Zuckerberg", 1958);
        Human son = new Human("Mark", "Zuckerberg", 1984, father, mother);
        Pet pet = new Pet("Dog", "Tom", 1, 49, new String[]{"eat", "sleep"});
        Human daughter
                = new Human(mother, father, pet, "Randi", "Zuckerberg",
                1986, 45, new String[][]{{"Monday"}, {"Swimming"}});

        System.out.println(mother);
        System.out.println(father);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(pet);
        daughter.feedPet(false);
        daughter.feedPet(true);
    }
}
