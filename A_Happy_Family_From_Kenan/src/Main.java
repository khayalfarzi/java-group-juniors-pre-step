
public class Main {
    public static void main(String[] args) {

        Human child = new Human("Vito", "Karleone","Vito Karlone", "Jane Karleone", 1975,75);
        System.out.println("name= "+ child.name
                +" surname = " + child.surname
                +" father = " + child.father
                +" mother = " + child.mother
                +" year = " + child.year
                +" iq = " + child.iq
        );
        /////////////////////////////////////////////////////////////////////////////////////////////
        Pet dog = new Pet("cat", "Rock", 7, 49);
        System.out.println(dog.species+" "+ dog.nickname + " "+ dog.age+" "+ dog.trickLevel);
        /////////////////////////////////////////////////////////////////////////////////////////////
        Human.greetPet(dog);
        Human.describePet(dog);
        /////////////////////////////////////////////////////////////////////////////////////////////
        Pet.eat();
        Pet.respond(dog.nickname);
        Pet.foul();



    }
}
