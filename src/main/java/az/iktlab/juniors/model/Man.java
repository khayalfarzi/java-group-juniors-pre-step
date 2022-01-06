package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

public final class Man extends Human{

    @Override
    public void greetPet() {
        System.out.printf("Hello, %s%n",
                Validator.isNull(getPet().getNickname()) ? getPet().getNickname() : "No Information!");
    }
}
