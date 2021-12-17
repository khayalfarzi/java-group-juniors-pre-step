package Family;

public class Main {
    public static void main(String[] args) {
        String[] childPetHabits1 = {"eat", "drink", "sleep"};
        Pet chilPet1 = new Pet("dog", "Rock", 2, 30, childPetHabits1);
        Human father1 = new Human("James","Bolsman", 1970);
        Human mother1 = new Human("Katarina", "Yelkov", 1976);
        Human child1 = new Human("Tom","Holland", 2007, 57, chilPet1, father1, mother1);
        System.out.println(chilPet1);
        System.out.println(child1);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        String[] childPetHabits2 = {"eat", "drink", "sleep", "run"};
        String[] fatherPetHabits2 = {"eat", "drink", "sleep"};
        String[] motherPetHabits2 = {"eat", "drink", "sleep"};

        Pet chilPet2 = new Pet("dog", "Rock", 1, 30, childPetHabits2);
        Pet fatherPet2 = new Pet("dog", "John", 3, 41, fatherPetHabits2);
        Pet motherPet2 = new Pet("dog", "Romi", 2, 38, motherPetHabits2);

        Human grandFatherFather = new Human("Roman", "Aki", 1952);
        Human grandMotherFather = new Human("Zarya", "Lublyana", 1954);

        Human grandFatherMother = new Human("Yasina", "Lomov", 1954);
        Human grandMotherMother = new Human("Rosa", "Xarova", 1954);

        Human father = new Human("Andrew", "Torkov", 1976, 76, fatherPet2, grandFatherFather,grandMotherFather);
        Human mother = new Human("Katarina", "Yelkov", 1982, 80, motherPet2,  grandMotherMother, grandMotherMother);

        Human child = new Human("Tom","Holland", 2007, 57, chilPet2, father, mother);
        System.out.println(child);
        child.describePet();
        child.greetPet();
        child.getPet().eat();
        child.getPet().foul();
        child.getPet().respond();


    }
}


