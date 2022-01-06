package az.baku.GroupJuniors;

import az.baku.Models.Family;
import az.baku.Models.Human;
import az.baku.Models.Pet;
import az.baku.Models.Species;

public class App {
    public static void main(String[] args) {
        Human mother = new Human("Nargiz", "Dilanchiyea", (short) 1972, (byte) 66, new String[][]{});
        Human father = new Human("Qoca", "Dilanchiyev", (short) 1968, (byte) 70, new String[][]{});
        Human child1 = new Human("Sabir", "Sabirli", (short) 1998, (byte) 88, new String[][]{});
        Human child2 = new Human("Mark", "Sabirli", (short) 2000, (byte) 88, new String[][]{});
        Human child3 = new Human("Aishe", "Sabirli", (short) 2008, (byte) 88, new String[][]{});
        Human child4 = new Human("Ella", "Sabirli", (short) 2008, (byte) 88, new String[][]{});
        Human[] children = new Human[]{child1, child2, child3};

        Pet tom = new Pet(Species.CAT, "Tom", (byte) 12, (byte) 45, new String[]{});

        Family family1 = new Family(mother, father, children, tom);
        System.out.println(family1);
        family1.deleteChild(0);
        System.out.println(family1);


//        for (int i = 0; i < 10; i++) {
//                    Human child1 = new Human("Sabir", "Sabirli", (short) 1998, (byte) 88, new String[][]{});
//        }
//        for (int i = 0; i < 10; i++) {
//            Pet pet = new Pet(Species.CAT, "Tom", (byte) 12, (byte) 45, new String[]{});
//            Family family = new Family(mother, father, new Human[]{child1}, tom);
//        }
        Family.countOfFamily();


    }
}
