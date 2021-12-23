package az.iktlab.juniors;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;

    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet, String[] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {

    }

    //    Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone,
//    pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}
    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s, father=%s, " +
                        "pet= %s}", name, surname, year, iq,
                mother, father, pet.toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setİq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    void describePet() {
        System.out.println("I have a" + pet.getSpecies() + "he is" + pet.getNickname() + "years old,he is");
        System.out.println((iq > 50) ? "very sly" : "almost not sly");
    }
}
