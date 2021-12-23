package az.iktlab.juniors;

import az.iktlab.juniors.concretes.Family;
import az.iktlab.juniors.concretes.Human;
import az.iktlab.juniors.concretes.Pet;
import az.iktlab.juniors.utils.ExceptionUtil;

public class Main {

    public static void main(String[] args) throws ExceptionUtil {
        Human mother = new Human("Anna", "Ivanova", 1995, (byte) 90, new String[][]{});
        Human father = new Human("Anton", "Antonov", 1995, (byte) 90, new String[][]{});
        Human child = new Human("Totu", "Antonov", 2019, (byte) 10, null);
        Human[] children = new Human[] {child};
        Pet dog = new Pet("Dob", "Sharik", (byte) 2, (byte) 50, null);
        Family happyFamily = new Family(mother, father, children, dog);
        System.out.println(happyFamily);
        System.out.println("------------------------------------");
        happyFamily.addChild(new Human("Balaw", "some", 2021, (byte) 50, null));
        System.out.println(happyFamily);
        System.out.println("--------------------------------------");
        happyFamily.deleteById(1);
        System.out.println(happyFamily);
        System.out.println("---------------------------------------");
        happyFamily.deleteByObject(child);
        System.out.println(happyFamily);
    }
}
