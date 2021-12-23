package az.iktlab.juniors;

public class Main {

    public static void main(String[] args) {
//        Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone,
//        pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}
        String[] habits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, habits);
        Human mother = new Human("Jane", "Karleone", 21);
        Human father = new Human("Vito", "Karleone", 25);

        String[] schedule = new String[]{"Monday", "Walk"};
        Human child = new Human("Micheal", "Karleone", 13, 101, mother, father, pet, schedule);

        System.out.println(child);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(pet);

    }
}
