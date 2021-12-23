public class Main {
    public static void main(String[] args) {


        Human human = new Human("Michael", "Karleona", 1977);
        Human mother = new Human("Jane", "Karleone", 1977);
        Human father = new Human("Vito", "Karlone", 1977);
        Pet pet = new Pet("dog", "Rock", 5, 100, new String[]{"eat", "drinl","sleep"});
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("dog","Rock");
        Human human1 = new Human("Michael", "Karleone", 1977, mother, father);
        Human human2 = new Human("Michael", "Karleone", 1977, 100, pet, mother, father,
                new String[][]{{"Monday", "Tuesday", "Saturday"}, {"Eat", "Drink", "Sleep"}});
        Human human3 = new Human();

        human2.describePet();

        System.out.println("= = = = = ");
        human2.greetPet();

        System.out.println("= = = = = ");
        human2.pet.eat();

        System.out.println("= = = = = ");
        human2.pet.foul();

        System.out.println("= = = = = ");
        human2.pet.respond();

        System.out.println("= = = = = ");
        System.out.println(human2.toString());

        System.out.println("= = = = = ");
        System.out.println(human1.toString());
    }
}
