package happyfamily;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Human grandfather = new Human();
        grandfather.setName("Thomas");
        Human father = new Human("Hamlet","Thomas",1972);
        father.setFather(grandfather);
        Human mother = new Human("Juliet","Thomas",1971);
        String[][] schedule ={{"eat","drink"},{"eat","drink","walk"},{"eat","drink","shower"},
                {"eat","drink","walk"},{"eat","drink",},{"eat","drink","walk"},{"eat","drink","shower"}};
        mother.setSchedule(schedule);
        father.setSchedule(schedule);
        Human son = new Human("Jack","Thomas",2005);
        son.setFather(father);
        son.setMother(mother);
        son.getFather().setMother(new Human());
        Human daughter = new Human("Diana","Thomas",2007,mother,father);
        Human grandmother= daughter.getFather().getMother();
        father.getMother().setName("Lucia");
        grandmother.setPet(new Pet("Fish","Nemo",2,23,new String[]{"eat","swim"}));
        son.setPet(new Pet("dog","Max",5,53,new String[]{"eat","sleep","bark"}));
        daughter.setPet(new Pet("bird","Yellow",1,43,new String[]{"eat","fly"}));
        Pet parentPet = new Pet("cat","Lucy");
        father.setPet(parentPet);
        mother.setPet(parentPet);
        parentPet.setAge(0);
        father.getPet().setTrickLevel(70);
        grandfather.setPet(new Pet("horse","Rocket"));
        grandfather.getPet().setAge(10);
        Human[] family = new Human[]{grandfather,grandmother,mother,father,son,daughter};
        for (Human i:family
             ) {
              System.out.println(i);
              System.out.println(i.getPet());
              i.greetPet();
              System.out.print(i.getPet().getNickname()+": ");
              i.getPet().respond();
              i.describePet();
              if(i.feedPet(false)){
                  System.out.print(i.getPet().getNickname()+": ");
                   i.getPet().eat();}
              if(i.getSchedule()!=null){
                  for (String s:i.getSchedule()[LocalDate.now().getDayOfWeek().getValue()-1]
                       ) {
                      if (s.equals("walk")) {
                          System.out.print(i.getPet().getNickname()+": ");
                          i.getPet().foul();
                      }
                  }
              }
              System.out.println("====================================================================");
        }
    }
}
