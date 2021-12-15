package az.iktlab.juniors.models;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String habits;

    //Empty Constructor
    public Pet()
    {

    }
    //Species and nickname
    public Pet(String species,String nickname)
    {
        this.species = species;
        this.nickname = nickname;
    }

    //All fields constructor
    public Pet(String species, String nickname, int age, int trickLevel, String habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!%n",this.nickname);
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString()
    {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=[%s]}",
                this.species,this.nickname,this.age,this.trickLevel,this.habits);
    }

}
