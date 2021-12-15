import java.util.Arrays;

public class Human {

    String name;
    String surname;
    Integer year;
    Integer iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println ("Hello" + pet.nickname);
    }
    public void describePet() {
        System.out.println("I have a" + pet.species + pet.age + "he is  years old");
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
