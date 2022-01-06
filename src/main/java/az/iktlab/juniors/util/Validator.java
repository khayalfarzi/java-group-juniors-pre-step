package az.iktlab.juniors.util;

import az.iktlab.juniors.model.Human;

public class Validator {

    public static boolean isNull(Object object){
        return object != null && object != "null" && !object.equals("[]") && !object.equals("");
    }

    public static boolean isTrueForIqOrForTrickLevel(Byte iq) {
        return iq <= 100 && iq >= 1;
    }

    public static boolean isExist(Human[] array, Human newChild){
        for (Human child : array) {
            if(newChild.equals(child)) return false;
        }
        return true;
    }
}
