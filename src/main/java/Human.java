import java.util.Arrays;

public class Human {
    String name, surname;
    int dateOfBirth;// year
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] week_day;

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
         this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] week_day) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.week_day = week_day;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", week_day=" + Arrays.toString(week_day) +
                '}';
    }


    void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    void describePet() {
        String text;
        if (pet.getAge() > 50) {
            text = "very sly";
        } else {
            text = "almost not sly";
        }
        System.out.println("I have a " + pet.getSpecies() +
                ", he is " + pet.getAge() + " years old,he is " + text);
    }
}