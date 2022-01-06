package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

public class Fish extends Pet{

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!%n",
                Validator.isNull(getNickname()) ? getNickname() : "No Information!");
    }
}
