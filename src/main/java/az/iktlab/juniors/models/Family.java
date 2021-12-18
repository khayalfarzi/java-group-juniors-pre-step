package az.iktlab.juniors.models;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(){
        {
            System.out.printf("Object type: %s%n",Family.this);
        }
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        {
            System.out.printf("Object type: %s%n",Family.this);
        }
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        {
            System.out.printf("Object type: %s%n",Family.this);
        }
    }

    static {
        System.out.printf("Class name: %s%n",Family.class );
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

    public void  greetPet(){
        System.out.printf("Hello, %s%n",isNull(getPet().getNickname()));
    }

    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s%n",
                isNull(getPet().getSpecies()),isNull(getPet().getAge()),
                getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public boolean isFeedTime(Boolean isFeedTime){
        System.out.printf( isFeedTime ?
                        "Hm... I will feed Jack's %s.%n" : "I think Jack's %s is not hungry.%n",
                isNull(getPet().getNickname()));
        return isFeedTime;
    }

    public boolean addChild(Human child){
        if(child == null ) return false;
        else {
            Human[] changedChildren = new Human[getChildren().length + 1];

            for (int i = 0; i < getChildren().length + 1; i++) {
                changedChildren[i] = i < getChildren().length ? getChildren()[i] : child;
            }
            setChildren(changedChildren);
            return true;
        }
    }

    public boolean deleteChild(int index){
        if(index < 0 || index >= getChildren().length) return false;
        else {
            Human[] changedChildren = new Human[getChildren().length-1];
            int j = 0;
            for (int i = 0; i < getChildren().length; i++) {
                if(i != index){
                    changedChildren[j] = getChildren()[i];
                    j++;
                }
            }
            setChildren(changedChildren);
            return true;
        }
    }

    public boolean deleteChild(Human child){
        if(child != null){
            Human[] changedChildren = new Human[getChildren().length-1];
            int j = 0;
            for (int i = 0; i < getChildren().length; i++) {
                if( !( child.equals(getChildren()[i]) ) ){
                    changedChildren[j] = getChildren()[i];
                    j++;
                }
            }
            setChildren(changedChildren);

            return true;
        }
        return false;

    }

    public Byte countFamily(){
        return (byte)(getChildren().length + (getMother() != null ? 1 : 0) + (getFather() != null ? 1 : 0));
    }


    public Object isNull(Object object){
        return object != null ? object : "( No information )";
    }

    @Override
    public String toString() {
        return String.format("Family{ mother=%s%n, father=%s%n, pet = %s%n, children=%s}%n",
                isNull(getMother()), isNull(getFather()) ,
                isNull(getPet()),
                isNull(Arrays.toString(getChildren())) );
    }

    @Override
    public boolean equals(Object obj) {
        Family family = (Family) obj;
        return family.getMother().equals(getMother()) && family.getFather().equals(getFather());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
