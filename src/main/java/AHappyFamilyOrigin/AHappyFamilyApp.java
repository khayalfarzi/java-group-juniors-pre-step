package AHappyFamilyOrigin;

public class AHappyFamilyApp {
    public static void main(String[] args) {

        Human emptyHuman = new Human();
        Human mark = new Human("Mark", "Zuckerberg", 37);
        Human family1 = new Human("John", "Simpson", 23, new Human("Anna"), new Human("Pedro"));
        Human family2 = new Human("Jessica", "Bile", 28, 60, new Pet("Dog", "Yummy", 4, 45, new String[]{}), new Human("Fatima"), new Human("Marvel"), new String[][]{{"jump"},{"swim"},{"run"}});
//        System.out.println(String.format("%s\n%s\n%s\n%s", emptyHuman, mark, family1, family2));
        Pet pet = new Pet("Dog", "Ruck", 19, 43, new String[]{"walk"});

        family2.describePet();
        System.out.println(family2.feedPet(false, pet.getTrickLevel()) );
    }
}