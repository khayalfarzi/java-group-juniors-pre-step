package az.baku.Models;

import java.util.Arrays;

public class Family {
    public static int counter;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        counter++;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
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

    public boolean isExist(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                return true;
            }
        }
        return false;
    }

    public void deleteChild(Human child) {
        if (isExist(child)) {
            Human[] newArr = new Human[children.length - 1];
            for (int j = 0, k = 0; j < children.length; j++) {
                if (children[j].equals(child)) {
                    continue;
                }
                newArr[k++] = children[j];
            }
            children = newArr;
            System.out.println("The object deleted successfully!");
        } else System.out.println("The child cannot be found in the family");
    }

    public void deleteChild(int index) {
        if (index >= 0 && index <= children.length) {
            Human[] newArr = new Human[children.length - 1];
            for (int i = 0, k = 0; i < children.length; i++) {
                if (children[i].equals(children[index])) {
                    continue;
                }
                newArr[k++] = children[i];
            }
            children = newArr;
            System.out.println("The object deleted successfully!");
        }else System.out.println("The child cannot be found in the family");
    }

    public static void countOfFamily() {
        System.out.printf("Count of family is:%d\n", counter);
    }

    @Override
    public boolean equals(Object obj) {
        Family family = (Family) obj;
        if (this.mother != family.mother) return false;
        else if (this.father != family.father) return false;
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Null pointers of Family were collected by garbage collector");
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
