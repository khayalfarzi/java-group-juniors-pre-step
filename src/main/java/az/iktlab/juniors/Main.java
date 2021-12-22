package az.iktlab.juniors;

import az.iktlab.juniors.concretes.Human;
import az.iktlab.juniors.concretes.Pet;
import az.iktlab.juniors.utils.ExceptionUtil;

public class Main {

    public static void main(String[] args) throws ExceptionUtil {
        Pet pet = new Pet("Dog", "Bobby", (byte) 2, (byte) 10, null);
        Human human = new Human("Charly", "Keppa", 20000, (byte) 90, pet, null, null, null);
        System.out.println(human);
        System.out.println(human.feedPet(false, pet.getTrickLevel()));
    }
}
