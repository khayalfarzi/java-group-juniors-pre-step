package az.iktlab.juniors.models;



public class Human {

    public String name;
    public String surname;
    public int year;
    public int iq;
    public Human mother;
    public Human father;
    public Pet pet;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year,Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public void  greetPet(){
        System.out.printf("Hello, %s%n",this.pet.nickname);
    }

    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s%n",
                this.pet.species,this.pet.age,this.pet.trickLevel > 50 ? "very sly" : "almost not sly");
    }

    public boolean feedPet(Boolean feedIsTime){
        System.out.printf( feedIsTime ? "Hm... I will feed Jack's %s." : "I think Jack's %s is not hungry.",this.pet.nickname);
        return feedIsTime;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s %s, father=%s %s, pet=%s}",
                this.name,this.surname,this.year,this.iq,this.mother.name,this.mother.surname,this.father.name,this.father.surname,this.pet);
    }
}
