package az.iktlab.juniors.util;

public class Validator {

    public static boolean isNull(Object object){
        return object != null && object != "null" && !object.equals("[]") && !object.equals("");
    }

    public static boolean isTrueForIqOrForTrickLevel(Byte iq) {
        return iq <= 100 && iq >= 1;
    }

}
