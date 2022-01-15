package az.iktlab.juniors.util;

import az.iktlab.juniors.model.Human;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static az.iktlab.juniors.util.Validator.*;
import static junit.framework.Assert.*;


public class ValidatorTest {


    @Test
    public void isNullTest(){
        Assert.assertFalse(isNull(""));
        Assert.assertFalse(isNull("[]"));
        Assert.assertFalse(isNull(null));
        Assert.assertFalse(isNull("null"));
        Assert.assertTrue(isNull("word"));
    }

    @Test
    public void isTrueForIqOrForTrickLevelTest() {
        assertTrue(isTrueForIqOrForTrickLevel((byte) 99));
        assertFalse(isTrueForIqOrForTrickLevel((byte) -1));
        assertFalse(isTrueForIqOrForTrickLevel((byte) 101));
    }


}
