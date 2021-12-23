package Models;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    public static int counter;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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
        System.out.printf("Hello,%s\n", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s , he is %d years old,", pet.getNickname(), pet.getAge());
        System.out.println(pet.getTrickLevel() > 50 ? " he is very sly" : " almost not sly");
    }

    public void addChild(Human[] arr, Human child) {
        int length = arr.length;
        Human[] newArr = new Human[length + 1];
        for (int i = 0; i < length; i++) {
            newArr[i] = children[i];
        }
        newArr[length] = child;
        children = newArr;
        System.out.println("New child added successfully!");
    }

    public void deleteChild(Human child) {
        Human[] newArr = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                continue;
            }
            newArr[k++] = children[i];
            children = newArr;
            System.out.println("The object deleted successfully!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Family family = (Family) obj;
        if (this.mother != family.mother) return false;
        else if (this.father != family.father) return false;
        return true;
    }

    public static void countOfFamily() {
            System.out.printf("Count of family is:%d\n", ++counter);
    }

    @Override
    public String toString() {
        return "Family{" +
                "\n\tmother=" + mother +
                "\n\tfather=" + father +
                "\n\tchildren=" + Arrays.toString(children) +
                "\n\tpet=" + pet +
                '}';
    }
}
