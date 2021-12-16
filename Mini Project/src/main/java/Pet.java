import java.util.Arrays;
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public String eat(){
        return ("I am eating");
    }
    public String respond(){
        return("Hello, owner. I am-" +getNickname()+". I miss you!");
    }
    public String foul(){
        return ("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet() {
    }
    public Pet(String species,
               String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species,
               String nickname,
               int age,
               int trickLevel,
               String[] habits) {

        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {

        return nickname;
    }

    public int getTrickLevel() {
        return trickLevel;
    }


}
