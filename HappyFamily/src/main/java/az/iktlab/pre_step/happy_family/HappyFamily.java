package az.iktlab.pre_step.happy_family;

public class HappyFamily {
    public static void main(String[] args) {
        /***--->Empty constructor<---***/
        Human mother = new Human();
        mother.setName("Jane ");
        mother.setSurname("Karleone");
        mother.setYear(1957);

        /***--->constructor which describes the name, surname and the date of birth<---***/
        Human father = new Human("Vito ", "Karleone", 1955);

        /***--->constructor which describes all the fields for the pet<---***/
        Pet dog = new Pet("dog","Rock", 5,75 , new String[]{"eat", "drink", "sleep"});

        /***--->constructor which describes all the fields<---***/
        Human child = new Human("Michael", "Karleone", 1977, 90, mother, father, dog,
                new String[][]{{"Friday"},{"Swimming"}});

        System.out.println(child.toString());
        System.out.println(child.describePet());
        System.out.println(child.feedPet(false));
    }
}
