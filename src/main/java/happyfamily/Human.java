package happyfamily;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
   private String name;
   private String surname;
   private int year;
   private int iq;
   private String[][] schedule;
   private Family family;
    static{
        System.out.println("Human class is being loaded");
    }
    {
        System.out.println("Human object is created");
    }
   public Human(String name, String surname){
       setName(name);
       setSurname(surname);
   }
   public Human(String name, String surname, int year){
       this(name,surname);
       setYear(year);
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
    public String[][] getSchedule() {

        return schedule;
    }

    public void setSchedule(String[][] schedule) {

            this.schedule = schedule;

    }
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet(){

       System.out.printf("Hello, %s",getFamily().getPet().getNickname());

    }

    public void describePet(){
           System.out.printf("I have a %s, he is %d years old, he is %s%n", getFamily().getPet().getSpecies(),
                   getFamily().getPet().getAge(),((getFamily().getPet().getTrickLevel() < 51) ?
                           ("Almost not sly") : ("Very sly")));

    }
     public boolean feedPet(boolean feedTime){
       boolean result;
         Random random= new Random();
       if(!feedTime & random.nextInt(100)>getFamily().getPet().getTrickLevel()){
           System.out.printf("I think %s is not hungry%n",getFamily().getPet().getNickname());
           result = false;
       }else
       {
           System.out.printf("Hm... I will feed %s%n", getFamily().getPet().getNickname());
           result = true;
       }
       return result;
     }
    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, schedule=%s}%n",
                getName(),getSurname(),getYear(),getIq(),(getSchedule()!=null)?
                        (Arrays.deepToString(getSchedule())):(""));
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(!(obj instanceof  Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName()) & human.getSurname().equals(getSurname()) & human.getYear()==getYear()
                & human.getIq()==getIq() & human.family.equals(family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIq(),getName(),getSurname(),getFamily(),getYear());
    }
}
