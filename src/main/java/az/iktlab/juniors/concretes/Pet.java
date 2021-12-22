package az.iktlab.juniors.concretes;

import az.iktlab.juniors.abstracts.Entity;
import az.iktlab.juniors.utils.ExceptionUtil;

import java.util.Arrays;

public class Pet implements Entity {

    private String species;
    private String nickname;
    private Byte age;
    private Byte trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, Byte age, Byte trickLevel, String[] habits) throws ExceptionUtil {
        this(species, nickname);
        if (age < 0) {
            throw new ExceptionUtil("Age must not be negative number.");
        }
        this.age = age;
        if (trickLevel > 100 || trickLevel < 1) {
            throw new ExceptionUtil("Trick level must be between 1 to 100");
        }
        this.trickLevel = trickLevel;
        this.habits = habits;
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

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) throws ExceptionUtil {
        if (age < 0) {
            throw new ExceptionUtil("Age must not be negative number.");
        }
        this.age = age;
    }

    public Byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Byte trickLevel) throws ExceptionUtil {
        if (trickLevel > 100 || trickLevel < 1) {
            throw new ExceptionUtil("Trick level must be between 1 to 100");
        }
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hollo owner. I am - %s. I miss you!", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (species != null ? !species.equals(pet.species) : pet.species != null) return false;
        if (nickname != null ? !nickname.equals(pet.nickname) : pet.nickname != null) return false;
        if (age != null ? !age.equals(pet.age) : pet.age != null) return false;
        if (trickLevel != null ? !trickLevel.equals(pet.trickLevel) : pet.trickLevel != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (trickLevel != null ? trickLevel.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Pet{species='%s', nickname='%s', age=%s, trickLevel=%s, habits=%s}",
                species, nickname, age, trickLevel, Arrays.toString(habits));
    }
}
