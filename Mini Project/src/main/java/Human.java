public class Human {

    private String name;
    private String surname;

    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private  Human father;
    private String [][] schedule;
    public String greetPet(){
        return ("Hello," + pet.getNickname());
    }
    public String describePet(){
        return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " +
                (pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name+ '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.getName()+" " +mother.getSurname()+
                ", father=" + father.getName() +" "+father.getSurname()+
                ", pet=" + pet +
                '}';
    }

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name,
                 String surname,
                 int year,
                 Human mother,
                 Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    public Human(String name,
                 String surname,
                 int year,
                 int iq,
                 Human mother,
                 Human father,
                 Pet pet,
                 String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule=schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

