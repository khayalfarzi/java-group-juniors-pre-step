package az.iktlab.juniors.concretes;

import az.iktlab.juniors.abstracts.Entity;
import az.iktlab.juniors.utils.ExceptionUtil;
import az.iktlab.juniors.utils.Util;

import java.util.Arrays;

public class Family implements Entity {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private int countOfFamilyMembers = 2;

    static {
        System.out.printf("Class is being loaded %s\n", Family.class);
    }

    {
        System.out.printf("Class is being loaded %s\n", this.getClass().getName());
    }

    public Family() throws ExceptionUtil {
        if (mother == null || father == null) {
            throw new ExceptionUtil("Family must be created with the presence of two parents, and without children.");
        }
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) throws ExceptionUtil {
        if (mother == null || father == null || mother.isMarried() || father.isMarried()) {
            throw new ExceptionUtil("Family must be created with the presence of two parents, and father and mother " +
                    "must not be married before, and without children.");
        }
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        father.setMarried(true);
        mother.setMarried(true);
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
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet() {
        String result = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %d years old, he is %s", pet.getSpecies(), pet.getAge(), result);
    }

    public boolean feedPet(boolean isFeedingTime, Byte trickLevel) {
        return Util.feedPet(isFeedingTime, trickLevel, pet.getNickname());
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        int count = 0;
        for (Human human : children) {
            newChildren[count++] = human;
        }
        newChildren[count++] = child;
        children = new Human[count];
        children = newChildren;
    }

    public boolean deleteById(int index) {
        if (index < 0 || index > children.length - 1) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (i != index)
                newChildren[count++] = children[i];
        }
        children = newChildren;
        return true;
    }

//    public boolean deleteById(int index) throws ExceptionUtil {
//        if (index < 0 || index > children.length - 1)
//            return false;
//        children = Util.deleteObjectById(children, index);
//        return true;
//    }
    

    public boolean deleteByObject(Human child) {
        int index = Util.findObjectId(children, child);
        return deleteById(index);
    }

    public int getCountOfFamilyMembers() {
        if (children.length != 0)
            return countOfFamilyMembers += children.length;
        return countOfFamilyMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Family family = (Family) o;

        if (mother != null ? !mother.equals(family.mother) : family.mother != null) return false;
        if (father != null ? !father.equals(family.father) : family.father != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(children, family.children)) return false;
        return pet != null ? pet.equals(family.pet) : family.pet == null;
    }

    @Override
    public int hashCode() {
        int result = mother != null ? mother.hashCode() : 0;
        result = 31 * result + (father != null ? father.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(children);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }

}
