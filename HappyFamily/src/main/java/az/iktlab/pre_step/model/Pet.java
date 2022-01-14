package az.iktlab.pre_step.modul;


import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private Integer age;
    private Byte trickLevel;
    private String[] habits;


    public Pet() {
    }

    public Pet(String species,
               String nickname,
               Integer age,
               Byte trickLevel,
               String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species,
               String nickname) {
        this.species = species;
        this.nickname = nickname;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Byte trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat(){
        System.out.println( "I am eating");
    }

    public void respond(){
        System.out.println(String.format("Hello, owner. I am - %s. I miss you!", getNickname()));
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public Object isNull(Object object){
        return object != null ? object : "( No information )";
    }

    @Override
    public String toString() {
        if (species.equals("dog")){
            return String.format("dog {nickname='%s', age=%s, trickLevel=%s, habits=%s}",
                    isNull(isNull(getNickname())), isNull(getAge()),
                    isNull(getTrickLevel()), isNull(Arrays.toString(getHabits())));
        }else {
            return String.format("%s{nickname='%s', age=%s, trickLevel=%s, habits=%s}",
                    isNull(getSpecies()),isNull(getNickname()),isNull(getAge()),
                    isNull(getTrickLevel()),isNull(Arrays.toString(getHabits())));
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return species.equals(pet.species) && nickname.equals(pet.nickname) && age.equals(pet.age) && trickLevel.equals(pet.trickLevel) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
