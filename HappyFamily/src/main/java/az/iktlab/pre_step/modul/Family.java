package az.iktlab.pre_step.modul;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children= new Human[]{};
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


    public Object isNull(Object object){
        return object != null ? object : "empty";
    }

    public void greetPet(){
        System.out.println(String.format("Hello, %s",pet.getNickname()) ) ;
    }


    public void describePet(){
        System.out.println(String.format("I have a %s, he is %s years old, he is %s",pet.getSpecies(),pet.getAge(),
                new String(pet.getTrickLevel() > 50 ? "very sly" : "almost not sly")));

    }

    public boolean feedPet(Boolean b){
        if (b==true){
            System.out.println(String.format("Hm... I will feed %s", pet.getNickname()));
            return true;
        }else {
            Random random = new Random();
            int r = random.nextInt(100);
            if (pet.getTrickLevel()>r){
                System.out.println(String.format("Hm... I will feed %s", pet.getNickname()));
                return true;}
            else {
                System.out.println(String.format("I think &s  is not hungry. %s", pet.getNickname()));
                return false;
            }
        }
    }

    public void addChild(Human child){
        Human[] newChild = new Human[getChildren().length+1];
        for (int i = 0; i < newChild.length-1; i++) {
            newChild[i] = getChildren()[i];
        }
        newChild[newChild.length - 1] = child;
        setChildren(newChild);
    }

    public boolean deleteChild(int index){
        if (index < 0 || index > getChildren().length) return false;
        else {
            Human[] deletedChild = new Human[getChildren().length - 1];
            int k = 0;
            for (int i = 0; i < getChildren().length; i++) {
                if (i == index) continue;
                else {
                    deletedChild[k] = getChildren()[i];
                    k++;
                }
            }
            setChildren(deletedChild);
            return true;
        }
    }

    public int countOfFamily(){
        return getChildren().length + (getFather() != null? 1 : 0) + (getMother() != null? 1 : 0);
    }

    @Override
    public String toString() {
        return String.format("Family{ mother=%s%n, father=%s%n, pet = %s%n, children=%s}%n",
                isNull(getMother()),
                isNull(getFather()) ,
                isNull(getPet()),
                isNull(Arrays.toString(getChildren())) );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && Arrays.equals(children, family.children) && pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }




}
