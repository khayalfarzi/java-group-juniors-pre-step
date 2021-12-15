package az.iktlab.pre_step.happy_family;


import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private Integer age;
    private Integer trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(String species,
               String nickname,
               Integer age,
               Integer trickLevel,
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


    public String eat(){
        return "I am eating";
    }

    public String respond(){
        return "Hello, owner. I am - " + getNickname() + ". I miss you!";
    }

    public String foul(){
        return "I need to cover it up";
    }


    @Override
    public String toString() {
        if (species.equals("dog")){
            return "Dog{" +
                    "nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + Arrays.toString(habits) +
                    '}';
        }else {
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + Arrays.toString(habits) +
                    '}';
        }
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

    public Integer getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Integer trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

}
