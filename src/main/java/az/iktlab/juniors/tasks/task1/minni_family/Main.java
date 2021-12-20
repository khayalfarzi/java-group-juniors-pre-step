package az.iktlab.juniors.tasks.task1.minni_family;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Nadir");
        human.setSurname("Nadir Jabbarli");
        human.setAge(19);
        human.setIq(90);
        Human father = new Human("Fizuli", "Jabbarov");
        human.setFather(father);
        human.setMother(new Human("Sevinc", "Jabbarova"));

        Pet pet = new Pet();
        pet.setNickname("Bars");
        pet.setAge(2);
        pet.setTrickLevel(100);
        pet.setSpecies("Qurd basar");
        pet.setHabits(new String[]{"walking", "barking", "playing"});

        human.setPet(pet);

        System.out.println(human);
    }
}
