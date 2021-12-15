import java.util.Arrays;

public class Human {
    String name;
    String surname;
    Integer year;
    Integer iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] shedule;

    public Human(Human mother) {
        this.mother = mother;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father, String[][] shedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.shedule = shedule;
    }



    public Human() {

    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name) {
        this.name = name;
    }

    void greetPet() {
        System.out.println("Hello," + this.pet.nickname);
    }

    void descibePet() {
        System.out.println("I have a" + this.pet.species + "and his" + this.pet.age + "years old");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name=" + name +
                ", surname=" + surname +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", shedule=" + Arrays.toString(shedule) +
                '}';
    }
}
