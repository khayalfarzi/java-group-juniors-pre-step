package az.iktlab.project;

import java.util.Arrays;
public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;

    public void greetPet() {
        System.out.printf("Hello, %s%n", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s, he is %d years old, he is %s%n", pet.getSpecies(), pet.getAge(),
                (pet.getTrickLevel() > 50 ? "very sly" : "almost not sly"));
    }
    public void addChildren(Human child){
        Human [] addChild=new Human[getChildren().length+1];
        for(int i=0;i<addChild.length-1;i++){
            addChild[i]=getChildren()[i];
        }
        addChild[addChild.length-1]=child;
        setChildren(addChild);
    }
    public boolean deleteChild(int i){
        if(i<0 || i>getChildren().length) return false;
        else{
            Human [] deleteChild=new Human[getChildren().length+1];
            int s=0;
            for(int j=0;j<deleteChild.length-1;j++){
                if(j==i) continue;
                else{
                    deleteChild[s]=getChildren()[j];
                    s++;
                }
            }
            setChildren(deleteChild);
            return true;
        }
    }
    public byte countFamily(){
        return (byte)(getChildren().length+ (getMother()!=null? 1:0)+(getFather()!=null? 1:0));
    }

    public Family() {
        System.out.printf("Object type: %s%n",Family.this);
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        System.out.printf("Object type: %s%n",Family.this);
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        System.out.printf("Object type: %s%n",Family.this);
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
    static {
        System.out.printf("Class name: %s%n",Family.class);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;

        Family family = (Family) o;

        if (!getMother().equals(family.getMother())) return false;
        if (!getFather().equals(family.getFather())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getChildren(), family.getChildren())) return false;
        return getPet().equals(family.getPet());
    }

    @Override
    public int hashCode() {
        int result = getMother().hashCode();
        result = 31 * result + getFather().hashCode();
        result = 31 * result + Arrays.hashCode(getChildren());
        result = 31 * result + getPet().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }


}