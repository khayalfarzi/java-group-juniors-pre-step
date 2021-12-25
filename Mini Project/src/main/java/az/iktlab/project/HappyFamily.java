package az.iktlab.project;

public class HappyFamily {
    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.setSpecies("cat");
        pet.setNickname("Mia");
        pet.setAge(1);
        Pet pet1=new Pet("hamster","Cookie");
        Pet dog =new Pet("dog", "Rock", 2, 60,
                new String[]{"eat", "drink", "sleep"});
        Human father=new Human();
        father.setName("Vito");
        father.setSurname("Karleona");
        father.setYear((short)1977);
        Human mother =new Human("Jane","Karleone",(short)1980);
        Human boy =new Human("Michael", "Karleone", (short)2000,(byte)90,dog,
                new String[][]{{"Sunday"},{"Sleeping"}});
        Human girl =new Human("Sophie", "Karleone", (short)1999,(byte)100,dog,
                new String[][]{{"Friday"},{"Compatition"}});
        Family family=new Family();
        family.setMother(mother);
        family.setFather(father);
        family.setChildren(new Human[]{boy});
        family.setPet(dog);
        family.greetPet();
        family.describePet();
        family.addChildren(girl);
        family.deleteChild(0);
        System.out.println(dog);
        System.out.println(girl);
        System.out.println(boy);
        System.out.println(family);

    }


}

