package lessons.homeworks.tasks170724;

import java.util.ArrayList;

public class InteractWith
{
    public static void main(String[] args)
    {
        ArrayList<Interactive> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new MouseHelper(new Mouse()));


        for (Interactive pet : pets)
        {
            System.out.println();
            pet.play();
            System.out.println("-----------");
            pet.feed();
            System.out.println("-----------");
            pet.feed();
            System.out.println("-----------");
            pet.wash();
            System.out.println("-----------");
            pet.play();
            System.out.println("-----------");
            pet.feed();
            System.out.println("-----------");
            pet.play();
            System.out.println("-----------");
            pet.play();
            System.out.println("__________________________________________");
        }
    }


}
