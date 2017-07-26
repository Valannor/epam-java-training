package lessons.homeworks.tasks170707.MyArrayList;

public class MyArrayListIteratorTest
{
    public static void main(String[] args)
    {
        MyArrayList<String> strings = new MyArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        for (String s : strings)
        {
            System.out.println(s);
        }
    }
}
