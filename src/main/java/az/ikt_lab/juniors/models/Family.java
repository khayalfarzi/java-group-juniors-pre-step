package az.ikt_lab.juniors.models;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family() {
        System.out.println(String.format("Object's type: %s", Family.this));
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        System.out.println(String.format("Object's type: %s", Family.this));
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        System.out.println(String.format("Object's type: %s", Family.this));
    }

    static {
        System.out.println(String.format("Name of %s :)", Family.class));
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void greetPet() {
        System.out.println(String.format("Hello, %s", pet.getNickname()));
    }

    public void describePet() {
        System.out.println(String.format("I have a %s, it is %d years old, it is %s",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly"));
    }

    public boolean feedPet(boolean isFeedingTime, Integer trickLevel) {
        if (isFeedingTime) {
            System.out.println(String.format("Hm... I'll feed %s", pet.getNickname()));
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            if (trickLevel > randomNumber) {
                System.out.println(String.format("Hm... I'll feed %s", pet.getNickname()));
                return true;
            } else {
                System.out.println(String.format("I think %s is not hungry.", pet.getNickname()));
                return false;
            }
        }
    }

    public boolean addChild(Human child) {
        Human[] childrenArr = new Human[getChildren().length];
        for (int i = 0; i < getChildren().length; i++) {
            childrenArr[i] = child != null ? (i < getChildren().length ? getChildren()[i] : child) : child;
        }
        setChildren(childrenArr);
        return true;
    }

    public boolean deleteChild(int index) {
        Human[] childrenArr = new Human[getChildren().length];
        if(index < 0) {
            String.format("Wrong Child's index: %d", index); return false; }
        int count = 0;
        for (int i = 0; i < getChildren().length; i++) {
            if (i != index) {
                childrenArr[count] = getChildren()[i];
                count++;
            }
        }
        setChildren(childrenArr);
        return true;
    }

    public void countFamily() {
        int countFamily = getChildren().length + ((getMother() != null & getFather() != null)  ? 2 : 0 );
        System.out.println(String.format("Amount of family members: %d", countFamily));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }
}
