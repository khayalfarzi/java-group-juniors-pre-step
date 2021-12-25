package az.iktlab.juniors.model;

import az.iktlab.juniors.util.Validator;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    /**
     * static {
        System.out.printf("Class name: %s%n",Family.class);
     }

     {
        System.out.printf("Object type: %s%n",Family.this);
     }
     */

    public Family(){

    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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
        System.out.printf("Hello, %s%n",
                Validator.isNull(getPet().getNickname()) ? getMother() : "No Information!");
    }

    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s%n",
                Validator.isNull(getPet().getSpecies()) ? getPet().getSpecies() : "No Information!",
                Validator.isNull(getPet().getAge()) ? getPet().getAge() : "No Information!",
                getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public boolean isFeedTime(Boolean isFeedTime){
        System.out.printf( isFeedTime ?
                        "Hm... I will feed Jack's %s.%n" : "I think Jack's %s is not hungry.%n",
                Validator.isNull(getPet().getNickname()) ? getPet().getNickname() : "No Information!");
        return isFeedTime;
    }

    public boolean addChild(Human child){
        if(child != null ) {
            Human[] changedChildren = Arrays.copyOf(getChildren(),getChildren().length+1);
            changedChildren[getChildren().length] = child;
            boolean isReady = Validator.isReady(Arrays.toString(getChildren()), Arrays.toString(changedChildren));
            setChildren(changedChildren);
            return isReady;
        }
        else return false;
    }

    public boolean deleteChild(int index){
        if(index < 0 || index >= getChildren().length) return false;
        else {
            Human[] changedChildren = new Human[getChildren().length-1];
            int j = 0;
            for (int i = 0; i < getChildren().length; i++) {
                if(i != index){
                    changedChildren[j++] = getChildren()[i];
                }
            }
            boolean isReady = Validator
                    .isReady(Arrays.toString(getChildren()), Arrays.toString(changedChildren));
            setChildren(changedChildren);
            return isReady;
        }
    }

    public boolean deleteChild(Human child){
        if(child != null){
            Human[] changedChildren = new Human[getChildren().length-1];
            int j = 0;
            for (int i = 0; i < getChildren().length; i++) {
                if( !( child.equals(getChildren()[i]) ) ){
                    changedChildren[j++] = getChildren()[i];
                }
            }
            boolean isReady = Validator
                    .isReady(Arrays.toString(getChildren()), Arrays.toString(changedChildren));
            setChildren(changedChildren);
            return isReady;
        }
        return false;

    }

    public Byte countFamily(){
        return (byte)(getChildren().length + (getMother() != null ? 1 : 0) + (getFather() != null ? 1 : 0));
    }

    @Override
    protected void finalize(){
        System.out.println("Closed Family in the finalizer");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{ mother=%s%n, father=%s%n, pet = %s%n, children=%s}%n",
                Validator.isNull(getMother()) ? getMother() : "No Information!",
                Validator.isNull(getFather()) ? getFather() : "No Information!",
                Validator.isNull(getPet()) ? getPet() : "No Information!",
                Validator.isNull(Arrays.toString(getChildren())) ? Arrays.toString(getChildren()) : "No Information!" );
    }
}
