public class MainClass {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Michael";
        human.surname = "Karleone";
        human.year = 1975;
        human.iq = 90;
        human.mother = new Human();
        human.mother.name = "Jane";
        human.father = new Human();
        human.father.name = "Vito";




        Pet pet = new Pet();
        pet.species = "dog";
        pet.trickLevel = 75;
        pet.nickname = "rock";
        pet.age = 5;
        pet.habits = new String[]{"eat", "drink", "sleep"};

        System.out.println(human+","+pet);

    }
}

