package az.happy.family.util;

import az.happy.family.model.Human;

public class Validator {

    public static boolean isChildrenNotNull(Human[] children) {
        return children != null;
    }

    public static boolean isHumanNotNull(Human human) {
        return human != null;
    }
}
