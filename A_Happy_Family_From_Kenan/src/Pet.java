public class Pet {
    String species;
    String nickname;
    int age;
    String trickLevel;
//    String [][] habist;

    static void eat(){
        System.out.println("I am eating");
    }

    static void respond(String nickname){
        System.out.println("Hello, owner. I am "+ nickname +". I miss you!");
    }

    static void foul(){
        System.out.println("I need to cover it up");
    }



    public Pet(String species, String nickname, int age, int trickLevel){
        this.species = species;
        this.nickname=nickname;
//        this.habist = habist;


        if (age<50){
            this.age = age;
        }else{
            System.out.println("Yaşı düzgün qeyd edilməyib. Zəhmət olmasa yaşı düzgün qeyd edin!");
        }

        if (trickLevel<100 && trickLevel>=50){
            this.trickLevel = "very sly";
        }else if (trickLevel<50 && trickLevel>1){
            this.trickLevel = "almost not sly";
        }else{
            this.trickLevel = "Zəhmət olmasa rəqəmi düzgün qeyd edin!";
        }


    }



}