package az.iktlab.juniors.util;

public class Validator {


    public boolean isNull(Object object){
        return object != null ;
    }


    public boolean isTrueForIq(Byte iq) {
        return iq <= 100 && iq >= 1;
    }
}
