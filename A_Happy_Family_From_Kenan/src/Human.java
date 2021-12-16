public class Human {
    String name;
    String surname;
    String father;
    String mother;
    int year;
    int iq;


    static void greetPet(Pet pet){
        System.out.println("Hello "+ pet.nickname);
    }

    static void describePet(Pet pet){
        System.out.println("I have a "+ pet.species + ", he is " + pet.age + " years old, he is " + pet.trickLevel +".");
    }



    public Human(String name, String surname, String father, String mother, int year, int iq){

        this.name = name;
        this.surname = surname;
        this.father = father;
        this.mother = mother;

        if (year>1870) {
            this.year = year;
        }
        else {
            System.out.println("Doğum tarixinizi səhv qeyd etmisiniz, zəhmət olmasa düzgün qeyd edin.");
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        if (iq<=100) {
            this.iq = iq;
        }
        else {
            System.out.println("Iq-nü səhv qeyd etmisiniz, zəhmət olmasa düzgün qeyd edin.");
        }
    }



}
