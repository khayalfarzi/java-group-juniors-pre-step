package az.iktlab.juniors.utils;

import java.util.Random;

public class UtilClass {

    public static boolean feedPet(boolean isFeedingTime, Byte trickLevel, String nickname) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(isFeedingTime ? String.format("Hm...I'll feed %s", nickname) : trickLevel > randomNumber ?
                String.format("Hm...I'll feed %s", nickname) : String.format("I think %s is not hungry", nickname));
        return isFeedingTime || (trickLevel > randomNumber);
    }
}
