package com.sabirsabirli;

public class Family {

    public static void main(String[] args) {
        Pet tom = new Pet("Cat", "Tom", 2, 50, new String[]{"Jump,smiling"});

        tom.eat();
        tom.respond();

        System.out.println("==========================");

        Human mother = new Human("Nargiz", "Dilanchiyeva", 1972);
        Human father = new Human("Qoca", "Dilanchiyev", 1968);
        Human sabir = new Human("Sabir", "Sabirli", 1998, 80, tom, mother, father, new String[][]{});
        System.out.println(sabir);
        sabir.describePet();
        sabir.greetPet();

        System.out.println("==========================");

        Pet jerry = new Pet("Mouse", "Jerry", 1, 100, new String[]{"eating cheese"});
        jerry.eat();
        jerry.respond();

        System.out.println("==========================");

        Human mother1 = new Human("Karen", "Zuckerberg ", 1965);
        Human father1 = new Human("Edward ", "Zuckerberg", 1960);
        Human mark = new Human("Mark ", "Zuckerberg ", 1984, 100, jerry, mother1, father1, new String[][]{});
        System.out.println(mark);
        mark.describePet();
        mark.greetPet();
        System.out.println("==========================");


    }
}
