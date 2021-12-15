public class Main {


    public static void main(String[] args) {
        Human human = new Human();
        human.Name = "Michael";
        human.Surname = "Karleone";
        human.Year = 1997;
        human.IQ = 90;
        human.pet = new Pet();
        human.Mother = new Human();
        human.Mother.Name = "Jane";
        human.Father = new Human();
        human.Father.Name = "Vito";


        Pet pet = new Pet();
        pet.Nickname = "Rocky";
        pet.age = 5;
        pet.trickLevel = 75;
        pet.habits = new String[]{"eat", "drink", "sleep"};
        System.out.println(human);
        System.out.println(pet);


    }
}