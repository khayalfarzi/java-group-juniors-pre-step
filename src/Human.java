import java.util.Arrays;

public class Human extends Object {

    String Name;
    String Surname;
    Integer Year;
    Integer IQ;
    Pet pet;
    Human Mother;
    Human Father;
    String[][] schedule;


    public Human() {


    }

    public Human(String Name, String Surname, int Year, Human Mother, Human Father) {
        this.Name = Name;
        this.Surname = Surname;
        this.Year = Year;
        this.Mother = Mother;
        this.Father = Father;
    }

    public Human(String Name, String Surname, int Year) {
        this.Name = Name;
        this.Surname = Surname;
        this.Year = Year;
    }

    public void greetpet() {

        System.out.println("\"Hello," + pet.Nickname);

    }

    public void describePet() {

        System.out.println("I have a " + pet.species + " he is " + pet.age + " years old ");
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Year=" + Year +
                ", IQ=" + IQ +
                ", Pet='" + pet + '\'' +
                ", Mother=" + Mother +
                ", Father=" + Father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}

