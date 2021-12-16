package happyfamily;

import java.time.LocalDate;
import java.util.Random;

public class Human {
   private String name;
   private String surname;
   private int year;
   private int iq;
   private Pet pet;
   private Human mother;
   private Human father;
   private String[][] schedule;

   public Human(String name, String surname){
       setName(name);
       setSurname(surname);
   }
   public Human(String name, String surname, int year){
       this(name,surname);
       setYear(year);
   }
    public Human(String name, String surname, int year, Human mother, Human father){
       this(name,surname,year);
        setMother(mother);
        setFather(father);
    }
    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule){
      this(name,surname,year,mother,father);
      setIq(iq);
      setPet(pet);
      setSchedule(schedule);
    }
    public Human(){

    }

    public String getName() {

        return (name==null)?(""):(name);
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return (surname==null)?(""):(surname);
    }

    public void setSurname(String surname) {
       this.surname = surname;
    }

    public int getYear() {
           return year;

    }

    public void setYear(int year) {
        if(LocalDate.now().getYear()-100>year|| year> LocalDate.now().getYear()){
            System.out.println("Unreal birth year");
        }
        else {
            this.year = year;
        }
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if(iq<1 || iq>100){
            System.out.println("Iq level can be between 1 and 100");
        }
        else {
            this.iq = iq;
        }
    }

    public Pet getPet() {

        return pet;
    }

    public void setPet(Pet pet) {

        this.pet = pet;
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

    public void greetPet(){

       System.out.println("Hello, "+getPet().getNickname());

    }

    public void describePet(){
            System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + " years old, " +
                    "he is " + ((getPet().getTrickLevel() < 51) ? ("Almost not sly") : ("Very sly")));

    }
     public boolean feedPet(boolean feedTime){
       boolean result;
         Random random= new Random();
       if(!feedTime & random.nextInt(100)>getPet().getTrickLevel()){
           System.out.println("I think "+ getPet().getNickname()+" is not hungry");
           result=false;
       }else
       {
           System.out.println("Hm... I will feed "+getPet().getNickname());
           result=true;
       }
       return result;
     }
    @Override
    public String toString() {
        return "Human{name="+getName()+", surname="+getSurname()+", year="+getYear()+
                ", iq="+getIq()+", mother="+((getMother()==null)?(""):(getMother().getName()+
                " "+getMother().getSurname()))+ ", father="+((getFather()==null)?(""):(getFather().getName()+
                " "+getFather().getSurname()))+", pet="+((getPet()==null)?(""):(getPet().toString()))+"}";
    }
}
