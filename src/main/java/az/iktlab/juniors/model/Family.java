package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Family implements HumanCreator{

    public static String[] femaleNames = {"Emily","Hannah","Madison","Ashley","Sarah","Alexis","Samantha","Jessica",
            "Elizabeth","Taylor","Lauren","Alyssa","Kayla","Abigail","Brianna","Olivia","Emma","Megan","Grace",
            "Victoria","Rachel","Anna","Sydney","Destiny","Morgan","Jennifer","Jasmine","Haley","Julia","Kaitlyn",
            "Nicole","Amanda","Katherine","Natalie","Hailey","Alexandra","Savannah","Chloe","Rebecca","Stephanie",
            "Maria","Sophia","Mackenzie","Allison","Isabella","Amber","Mary","Danielle","Gabrielle","Jordan","Brooke",
            "Michelle","Sierra","Katelyn","Andrea","Madeline","Sara","Kimberly","Courtney","Erin","Brittany","Vanessa",
            "Jenna","Jacqueline","Caroline","Faith","Bailey","Paige","Shelby","Melissa","Kaylee","Christina",
            "Trinity","Mariah","Caitlin","Autumn","Marissa","Breanna","Angela","Catherine","Zoe","Briana","Jada",
            "Laura","Claire","Alexa","Kelsey","Kathryn","Leslie","Alexandria","Sabrina","Mia","Isabel","Molly","Leah",
            "Katie","Gabriella","Cheyenne","Cassandra","Tiffany","Erica","Lindsey","Kylie","Amy","Diana","Cassidy",
            "Ariana","Margaret","Kelly","Miranda","Maya","Melanie","Audrey","Jade","Gabriela","Caitlyn","Angel",
            "Jillian","Alicia","Jocelyn","Erika","Lily","Heather","Madelyn","Adriana","Arianna","Lillian","Kiara",
            "Riley","Crystal","Mckenzie","Meghan","Skylar","Ana","Britney","Angelica","Kennedy","Chelsea","Daisy",
            "Kristen","Veronica","Isabelle","Summer","Hope","Brittney","Lydia","Hayley","Evelyn","Bethany","Shannon",
            "Michaela","Karen","Jamie","Daniela","Angelina","Kaitlin","Karina","Sophie","Sofia","Diamond","Payton",
            "Cynthia","Alexia","Valerie","Monica","Peyton","Carly","Bianca","Hanna","Brenda","Rebekah","Alejandra",
            "Mya","Avery","Brooklyn","Lindsay","Ava","Desiree","Alondra","Ariel","Naomi","Jordyn", "Kendra","Mckenna",
            "Holly","Julie","Kendall","Kara","Jasmin","Selena","Esmeralda","Amaya", "Maggie","Claudia","Kyra","Cameron",
            "Karla","Kathleen","Abby","Delaney","Amelia","Casey","Serena","Savanna","Aaliyah","Giselle","Mallory",
            "April","Raven","Adrianna","Christine","Kristina","Nina","Asia","Natalia","Valeria"};

    public static String[] maleNames = {"Jacob","Michael","Matthew","Joshua","Christopher","Nicholas","Andrew",
            "Joseph","Daniel","Tyler","William","Brandon","Ryan","John","Zachary","David","Anthony","James","Justin",
            "Alexander","Jonathan","Christian","Austin","Dylan","Ethan","Benjamin","Noah","Samuel","Robert","Nathan",
            "Cameron","Kevin","Thomas","Jose","Hunter","Jordan","Kyle","Caleb","Jason","Logan","Aaron","Eric","Brian",
            "Gabriel","Adam","Jack","Isaiah","Juan","Luis","Connor","Charles","Elijah","Isaac","Steven","Evan","Jared",
            "Sean","Timothy","Luke","Cody","Nathaniel","Alex","Seth","Mason","Richard","Carlos","Angel","Patrick",
            "Devin","Bryan","Cole","Jackson","Ian","Garrett","Trevor","Jesus","Chase","Adrian","Mark","Blake",
            "Sebastian","Antonio","Lucas","Jeremy","Gavin","Miguel","Julian","Dakota","Alejandro","Jesse","Dalton",
            "Bryce","Tanner","Kenneth","Stephen","Jake","Victor","Spencer","Marcus","Paul","Brendan","Jeremiah",
            "Xavier","Jeffrey","Tristan","Jorge","Edward","Riley","Wyatt","Colton","Joel","Maxwell","Aidan",
            "Travis","Shane","Colin","Dominic","Carson","Vincent","Derek","Oscar","Grant","Eduardo","Peter","Henry",
            "Parker","Hayden","Collin","George","Bradley","Mitchell","Devon","Ricardo","Shawn","Taylor","Nicolas",
            "Francisco","Gregory","Liam","Kaleb","Preston","Erik","Alexis","Owen","Omar","Diego","Dustin","Corey",
            "Fernando","Clayton","Carter","Ivan","Jaden","Javier","Alec","Johnathan","Scott","Manuel","Cristian",
            "Alan","Raymond","Brett","Max","Andres","Gage","Mario","Dawson","Dillon","Cesar","Wesley","Levi","Jakob",
            "Chandler","Martin","Malik","Edgar","Trenton","Sergio","Josiah","Nolan","Marco","Peyton","Harrison",
            "Hector","Micah","Roberto","Drew","Brady","Erick","Conner","Jonah","Casey","Jayden","Emmanuel","Edwin",
            "Andre","Phillip","Brayden","Landon","Giovanni","Bailey","Ronald","Braden","Damian","Donovan","Ruben",
            "Frank","Pedro","Gerardo","Andy","Chance","Abraham","Calvin","Trey","Donald","Derrick"};
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;

    public Family(){
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pets = pets;
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void  greetPet(){
        getPets().forEach(pet -> {
            System.out.printf("Hello, %s%n",
                    Validator.isNull(pet.getNickname()) ? pet.getNickname() : "No Information!");
        });

    }

    public void describePet(){

        getPets().forEach(pet -> {
            System.out.printf("I have a %s, he is %s years old, he is %s%n",
                    Validator.isNull(pet.getSpecies()) ? pet.getSpecies() : "No Information!",
                    Validator.isNull(pet.getAge()) ? pet.getAge() : "No Information!",
                    Validator.isNull(pet.getTrickLevel()) ? pet.getTrickLevel() : 0 > 50 ?
                            "very sly" : "almost not sly");
        });
    }

    public boolean isFeedTime(Boolean isFeedTime){

        getPets().forEach(pet -> {
            System.out.printf( isFeedTime ?
                            "Hm... I will feed Jack's %s.%n" : "I think Jack's %s is not hungry.%n",
                    Validator.isNull(Validator.isNull(pet) ?
                            pet.getNickname() : null ) ? pet.getNickname() : "No Information!");

        });
        return isFeedTime;
    }

    public boolean addChild(Human child){
        if(child != null && child.getName() != null  ) {
            if(!getChildren().contains(child)){
                return getChildren().add(child);
            }
        }
        return false;
    }

    public boolean deleteChild(int index){
        if(index > 0 && index < getChildren().size()) {
            getChildren().remove(index);
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child){
        if(child != null)
            return getChildren().remove(child);
        return false;

    }

    public Byte countFamily(){
        return (byte)(getChildren().size() + (getMother() != null ? 1 : 0) + (getFather() != null ? 1 : 0));
    }

    @Override
    public void bornChild() {
        Random random = new Random();
        int genderNumber = random.nextInt(2);
        String[] names = genderNumber == 1 ? maleNames : femaleNames;
        Human person = genderNumber == 1 ? new Man() : new Woman();

        byte iq = (byte) ((random.nextInt((byte) (
                (this.father.getIq() >= this.mother.getIq() ? this.father.getIq() : this.mother.getIq()) -
                (this.father.getIq() <= this.mother.getIq() ? father.getIq() : mother.getIq())))) +
                (father.getIq() <= mother.getIq() ? father.getIq() : mother.getIq()));

        person.setName(names[random.nextInt(names.length)]);
        person.setSurname(father.getSurname());
        person.setIq(iq);
        person.setDate(LocalDate.now());
        addChild(person);
    }

    @Override
    protected void finalize(){
        System.out.println("Closed Family in the finalizer");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pets, family.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pets);
    }

    @Override
    public String toString() {
        return String.format("Family{ mother=%s%n, father=%s%n, pet = %s%n, children=%s}%n",
                Validator.isNull(getMother()) ? getMother() : "No Information!",
                Validator.isNull(getFather()) ? getFather() : "No Information!",
                Validator.isNull(getPets()) ? getPets() : "No Information!",
                Validator.isNull(getChildren()) ?
                        getChildren() : "No Information!" );
    }
}
