public class HappyFamily {
    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.setSpecies("cat");
        pet.setNickname("Mia");
        pet.setAge(1);
        Pet pet1=new Pet("hamster","Cookie");
        Pet dog =new Pet("dog", "Rock", 2, 60,new String[]{"eat", "drink", "sleep"});
        Human father=new Human();
        father.setName("Vito");
        father.setSurname("Karleona");
        father.setYear(1977);
        Human mother =new Human("Jane","Karleone",1980);
        Human sister=new Human("Bella","Karleone",1999,mother,father);
        Human child =new Human("Michael", "Karleone", 2000,90,mother,father,dog,new String[][]{{"Sunday"},{"Sleeping"}});
        System.out.println(dog.toString());
        System.out.println(child.toString());
        System.out.println(child.describePet());
        System.out.println(child.greetPet());
        System.out.println(dog.respond());
        System.out.println(dog.eat());
        System.out.println(dog.foul());
    }
}

