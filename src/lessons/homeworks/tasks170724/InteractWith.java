package lessons.homeworks.tasks170724;

public class InteractWith
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        System.out.println();
        cat.play();
        System.out.println("-----------");
        cat.feed();
        System.out.println("-----------");
        cat.feed();
        System.out.println("-----------");
        cat.wash();
        System.out.println("-----------");
        cat.play();
        System.out.println("-----------");
        cat.feed();
        System.out.println("-----------");
        cat.play();
        System.out.println("-----------");
        cat.play();
        System.out.println("__________________________________________");


        MouseHelper mouseHelper = new MouseHelper(new Mouse());
        System.out.println();
        mouseHelper.play();
        System.out.println("-----------");
        mouseHelper.feed();
        System.out.println("-----------");
        mouseHelper.feed();
        System.out.println("-----------");
        mouseHelper.wash();
        System.out.println("-----------");
        mouseHelper.play();
        System.out.println("-----------");
        mouseHelper.feed();
        System.out.println("-----------");
        mouseHelper.play();
        System.out.println("-----------");
        mouseHelper.play();
        System.out.println("__________________________________________");
    }

}
