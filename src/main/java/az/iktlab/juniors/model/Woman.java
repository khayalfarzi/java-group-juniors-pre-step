package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

public final class Woman extends Human{

    @Override
    public void greetPet() {
        System.out.printf("Hello, my dear %s%n",
                Validator.isNull(getPet().getNickname()) ? getPet().getNickname() : "No Information!");
    }

}
