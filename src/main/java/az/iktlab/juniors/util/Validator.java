package az.iktlab.juniors.util;

public class Validator {


    public static boolean isNull(Object object){
        if(object == null){
            return false;
        }else{
            return !object.equals("[]");
        }
    }

    public static boolean isTrueForIq(Byte iq) {
        return iq <= 100 && iq >= 1;
    }

    public static boolean isTrueForTrickLevel(Byte trickLevel) {
        return trickLevel <= 100 && trickLevel >= 1;
    }

    public static boolean isReady(String array, String newArray){
        return !( array.equals(newArray) );
    }
}
