package az.iktlab.juniors.utils;

import java.util.Random;

public class Util {

    public static boolean feedPet(boolean isFeedingTime, Byte trickLevel, String nickname) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(isFeedingTime ? String.format("Hm...I'll feed %s", nickname) : trickLevel > randomNumber ?
                String.format("Hm...I'll feed %s", nickname) : String.format("I think %s is not hungry", nickname));
        return isFeedingTime || (trickLevel > randomNumber);
    }

    public static <T> int findObjectId(T[] objects, T object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object))
                return i;
        }
        return -1;
    }


//    public static <T> T[] deleteObjectById(T[] objects, int index) {
//        T[] newObjects = (T[]) new Object[objects.length - 1];
//        int count = 0;
//        for (int i = 0; i < objects.length; i++) {
//            if (i != index)
//                newObjects[count++] = objects[i];
//        }
//        objects = newObjects;
//        return objects;
//    }

}
