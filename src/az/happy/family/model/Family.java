package az.happy.family.model;

import az.happy.family.util.Validator;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private int countFamily;

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
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

    public int getCountFamily() {
        return countFamily;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return countFamily == family.countFamily && Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, countFamily);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s",
                mother, father, Arrays.toString(children), pet + "}");
    }

    public boolean deleteChild(Human child) {
        if (Validator.isHumanNotNull(child)) {
            int currentChildrenCount = children.length;
            Human[] newChildren = new Human[currentChildrenCount - 1];

            for (int i = 0; i < currentChildrenCount; i++)
                if (!children[i].equals(child))
                    newChildren[i] = children[i];

            setChildren(newChildren);
        }
        return false;
    }

    public boolean deleteChild(int childIndex) {
        if (childIndex < 0 || childIndex > children.length) {
            return false;
        } else if (Validator.isChildrenNotNull(children)) {
            int currentChildrenCount = this.children.length;
            Human[] newChildren = new Human[currentChildrenCount - 1];
            for (int i = 0, newChildrenStartIndex = 0; i < children.length; i++) {
                if (i != childIndex) {
                    newChildren[newChildrenStartIndex] = children[i];
                    newChildrenStartIndex++;
                }
            }
            setChildren(newChildren);
            return true;
        }
        return false;
    }

    public void addChild(Human child) {
        if (Validator.isHumanNotNull(child)) {
            int currentChildrenCount = this.children.length;
            Human[] newChildren = new Human[currentChildrenCount + 1];

            for (Human human : children)
                if (human.equals(child))
                    return;

            System.arraycopy(children, 0, newChildren, 0, currentChildrenCount);
            newChildren[currentChildrenCount] = child;
            setChildren(newChildren);
        }
    }
}
