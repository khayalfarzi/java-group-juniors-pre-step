package GroupJuniors;

import Models.Family;
import Models.Human;
import Models.Pet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Human mother = new Human();
        mother.setName("Nargiz");
        mother.setSurname("Dilanchiyea");
        mother.setDateOfBirth((short) 1972);
        Human father = new Human();
        father.setName("Qoca");
        father.setSurname("Dilanchiyev");
        father.setDateOfBirth((short) 1968);
        Human child1 = new Human();
        child1.setName("Sabir");
        child1.setSurname("Sabirli");
        child1.setDateOfBirth((short) 1998);
        Human child2 = new Human();
        child2.setName("Narmin");
        child2.setSurname("Sabirli");
        child2.setDateOfBirth((short) 1999);
        Family family1 = new Family();
        family1.setMother(mother);
        family1.setFather(father);
        family1.setChildren(new Human[]{child1});
        family1.addChild(family1.getChildren(), child2);
        System.out.println(family1);
        System.out.println("^^^Before deleting");
        family1.deleteChild(child1);
        System.out.println(family1);

        Family family2 = new Family();
        Human mother1 = new Human();
        mother1.setName("Narmin");
        family2.setMother(mother1);
        family2.setFather(father);
        family2.setChildren(new Human[]{child1});
        family2.deleteChild(child1);
        System.out.println("Is equal?" + family1.equals(family2));

        if (family1.equals(family2))
        Family.countOfFamily();


    }
}
