package Family;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Pet pet;
    private Human father;
    private Human mother;

    public Human(String name, String surname, int dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }

    public Human(){

    }

    public void greetPet(){
        System.out.println("Hello " + pet.getNickname());
    }

    public void describePet(){
        String humanPetSly = (pet.getTrickyLevel()>50) ? "very sly" : "almost not sly";
        System.out.println("I have " + pet.getSpecies() + ", he is " +  pet.getAge() + " age old, he is " + humanPetSly);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if(iq>=1 && iq<=100){
            this.iq = iq;
        }else{
            System.out.println("Incorrect iq");
        }

    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name=" + name  +  ", surname=" + surname +  ", dateOfBirth=" + dateOfBirth + ", iq=" + iq +  ", pet=" + pet
                + ", father=" + father +  ", mother=" + mother + '}';
    }
}

