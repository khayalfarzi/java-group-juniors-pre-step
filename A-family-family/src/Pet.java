import java.util.Arrays;

public class Pet {

    String species;
    String nickname;
    Integer age;
    Integer trickLevel;
    String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname, Integer age, Integer trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    void eat() {
        System.out.println("I am eating");
    }

    void respond() {
        System.out.println("Hello owner, i am - " + this.nickname + " i miss you");
    }

    void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet"+"="+species+"{" +
                ", nickname=" + nickname +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }


}

