package az.iktlab.juniors.model;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class FamilyTest {

    Family family = new Family();

    @Test
    public void addChildTest(){
        assertFalse(family.addChild(null));

        assertFalse(family.addChild(new Human()));

        assertTrue(family.addChild(new Human("Albert","Eynisheydi")));
    }

    @Test
    public void isFeedTimeTest(){
        assertFalse(family.isFeedTime(false));

        assertTrue(family.isFeedTime(true));
    }
}
