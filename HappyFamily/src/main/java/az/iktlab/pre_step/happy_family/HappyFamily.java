package az.iktlab.pre_step.happy_family;

import java.util.Scanner;

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

        /***--->constructor which describes the name, surname, date of birth, father and mother<---***/
        Human brother = new Human("John", "Karleone", 1980, father,mother);



        System.out.println("------------------------------------------------------");
        System.out.println("-------Welcome to Happy Family-------");
        System.out.println("------------------------------------------------------");
        System.out.println("----------Please choose one of below Options----------");
        System.out.println("1. Show Human");
        System.out.println("2. Greet Pet");
        System.out.println("3. Descripe Pet");
        System.out.println("4. Feed Pet");
        System.out.println("5. Pet respond");
        System.out.println("6. Pet foul");
        System.out.println("7. Pet eat ");
        System.out.println("8. Show Pet");
        System.out.println("9. Exit");


        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        System.out.println("------------------------------------------------------");
        do {

            switch (option) {
                case 1:
                    System.out.println(child.toString());
                    break;
                case 2:
                    System.out.println(child.greetPet());
                    break;
                case 3:
                    System.out.println(child.describePet());
                    break;
                case 4:
                    System.out.println(child.feedPet(false));
                    break;
                case 5:
                    System.out.println(dog.respond());
                    break;
                case 6:
                    System.out.println(dog.foul());
                    break;
                case 7:
                    System.out.println(dog.eat());
                    break;
                case 8:
                    System.out.println(dog.toString());
                    break;
                case 9:
                    break;

            }
            System.out.print("Your choice: ");
            option = in.nextInt();
        }while (option!=9);



      /*  *//***--->Human Class's methods<---***//*
        System.out.println(child.toString());
        System.out.println(child.greetPet());
        System.out.println(child.describePet());
        System.out.println(child.feedPet(false));

        *//***--->Pet Class's methods<---***//*
        System.out.println(dog.eat());
        System.out.println(dog.respond());
        System.out.println(dog.foul());
        System.out.println(dog.toString());*/

    }
}
