package lessons.homeworks.tasks170710;

public class MyLinkedListTests
{
    public static void main(String[] args)
    {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");

        System.out.println(linkedList.remove(1));

        System.out.println(linkedList);
    }
}
