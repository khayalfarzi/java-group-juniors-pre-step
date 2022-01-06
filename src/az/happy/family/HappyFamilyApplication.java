package az.happy.family;

import az.happy.family.model.Family;
import az.happy.family.model.Human;
import az.happy.family.model.Pet;

public class HappyFamilyApplication {
    public static void main(String[] args) {
        Human mother = new Human("Karen", "Zuckerberg", 1955);
        Human father = new Human("Edward", "Zuckerberg", 1958);
        Human son = new Human("Mark", "Zuckerberg", 1984);
        Pet pet = new Pet("Dog", "Tom", 1, 49, new String[]{"eat", "sleep"});
        Human daughter
                = new Human("Randi", "Zuckerberg",
                1986, 45, new String[][]{{"Monday"}, {"Swimming"}});

        System.out.println(mother);
        System.out.println(father);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(pet);
        /*daughter.feedPet(false);
        daughter.feedPet(true);*/

        Family family = new Family(mother, father, new Human[]{});
        family.addChild(son);
        //System.out.println(family);
        family.addChild(daughter);
        System.out.println(family);
        family.addChild(son);
        family.addChild(son);
        family.addChild(son);
        family.addChild(son);
        System.out.println(family);
        System.out.println();
        family.addChild(daughter);
        System.out.println(family);

        family.deleteChild(daughter);
        System.out.println();
        System.out.println(family);
        family.addChild(daughter);
        System.out.println(family);
        family.deleteChild(0);
        System.out.println(family);
        family.deleteChild(0);
        System.out.println(family);
    }
}
