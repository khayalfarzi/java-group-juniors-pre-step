package az.iktlab.pre_step.happy_family;



import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name,
                 String surname,
                 Integer year,
                 Integer iq,
                 Human mother,
                 Human father,
                 Pet pet,
                 String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name,
                 String surname,
                 Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name,
                 String surname,
                 Integer year,
                 Human mother,
                 Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }


    public String greetPet(){
        return "Hello, " + pet.getNickname();
    }

    public String describePet(){
        return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " +
                new String(pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public boolean feedPet(Boolean b){
        if (b==true){
            System.out.println("Hm... I will feed " + pet.getNickname());
            return true;
        }else {
            Random random = new Random();
            int r = random.nextInt(100);
            if (pet.getTrickLevel()>r){
                System.out.println("Hm... I will feed " + pet.getNickname());
                return true;}
            else {
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.getName() + mother.getSurname() +
                ", father=" + father.getName() + father.getSurname() +
                ", pet=" + pet +
                '}';
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}

