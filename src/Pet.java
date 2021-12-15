import java.util.Arrays;

public class Pet {

    String species;
    String Nickname;
    Integer age;
    Integer trickLevel;
    String[] habits;

    public Pet() {


    }

    public Pet(String species, String Nickname) {
        this.species = species;
        this.Nickname = Nickname;
    }

    public Pet(String species, String Nickname, int age, int trickLevel) {
        this.species = species;
        this.Nickname = Nickname;
        this.age = age;
        this.trickLevel = trickLevel;

    }

    public static void eat() {
        System.out.println("'I am eating'");
    }

    public static void respond() {
        Pet pet1 = new Pet();
        pet1.Nickname = pet1.Nickname;

        System.out.println("'Hello, owner. I am -" + pet1.Nickname + " I miss you!'");

    }

    public static void foul() {
        System.out.println("'I need to cover it up'");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", Nickname='" + Nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}


