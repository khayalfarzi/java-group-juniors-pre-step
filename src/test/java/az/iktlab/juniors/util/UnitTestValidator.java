package az.iktlab.juniors.util;

import az.iktlab.juniors.model.Human;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class UnitTestValidator {

    @Test
    public void isNull(){
        Assert.assertFalse(Validator.isNull(""));
        Assert.assertFalse(Validator.isNull("[]"));
        Assert.assertFalse(Validator.isNull(null));
        Assert.assertFalse(Validator.isNull("null"));
        Assert.assertTrue(Validator.isNull("word"));
    }

    @Test
    public void isTrueForIqOrForTrickLevel() {
        Assert.assertTrue(Validator.isTrueForIqOrForTrickLevel((byte) 99));
        Assert.assertFalse(Validator.isTrueForIqOrForTrickLevel((byte) -1));
        Assert.assertFalse(Validator.isTrueForIqOrForTrickLevel((byte) 101));
    }

    @Test
    public void isExist(){
        Assert.assertFalse(Validator.isExist(
                new Human[]{
                        new Human("Amelia", "Butler", LocalDate.now()),
                        new Human("Carlos", "Butler")
                },
                new Human("Carlos", "Butler")));

        Assert.assertTrue(Validator.isExist(
                new Human[]{
                        new Human("Amelia", "Butler", LocalDate.now()),
                        new Human("Carlos", "Butler")
                },
                new Human("Robert", "Butler")));
    }
}
