public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Michael";
        human.surname = "Karleone";
        human.year = 1977;
        human.iq = 90;
        human.mother = new Human("Jane");
        human.father = new Human("Vito");

        System.out.println(human);

        Pet pet = new Pet();
        pet.species = "dog";
        pet.nickname = "Rock";
        pet.age = 5;
        pet.trickLevel = 75;
        pet.habits = new String[]{"eat", "drink", "sleep"};

        System.out.println(pet);

    }
}
