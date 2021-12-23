import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public Integer age;
    public int trickLevel;
    public String[] habits;

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello,owner.I am" + nickname + "I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, Integer age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
