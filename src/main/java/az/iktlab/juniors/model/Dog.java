package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

public class Dog extends Pet implements IDog{

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!%n",
                Validator.isNull(getNickname()) ? getNickname() : "No Information!");
    }

    @Override
    public void foul(){
        System.out.println("I need to cover it up");
    }
}
