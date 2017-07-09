package lessons.homeworks.tasks170707.MyArrayList;

public class MyArrayListTest
{
    public static void main(String[] args)
    {
        /*
        TEST 1
         */
        System.out.println("TESTS #1:");
        System.out.println("_______________________________________________________________");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);

        System.out.println("Test for list of Integers: " + list1);

        list1.remove(2);
        System.out.println("---------------------------------------------------------------");
        System.out.println("After removal of object in position 2: " + list1);


        /*
        TEST 2
         */
        System.out.println("\r\n\r\n\r\nTESTS #2:");
        System.out.println("_______________________________________________________________");

        MyArrayList<String> list2 = new MyArrayList<>();
        System.out.println("list2 empty now - " + list2.isEmpty());

        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");
        list2.add("six");
        list2.add("seven");
        list2.add("eight");
        list2.add("nine");
        list2.add("ten");

        System.out.println("---------------------------------------------------------------");
        System.out.println("list2: " + list2 + " | size: " + list2.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("There is not such element like \"eleven\". We removed it - " + list2.remove("eleven"));
        System.out.println("list2: " + list2 + " | size: " + list2.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("Now index 0 equals to: " + list2.get(0));
        System.out.println("Removing: " + list2.set(0, "ZERO"));
        System.out.println("Setting: " + list2.get(0) + " instead");

        System.out.println("---------------------------------------------------------------");
        System.out.println("Adding \"one\" to position \"1\"");
        list2.add(1, "one");
        System.out.println("list2: " + list2 + " | size: " + list2.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("list2 empty now - " + list2.isEmpty());


        /*
        TEST 3
         */
        System.out.println("\r\n\r\n\r\nTESTS #3 (as the previous one, but with less objects in the beginning):");
        System.out.println("_______________________________________________________________");

        MyArrayList<String> list3 = new MyArrayList<>();
        System.out.println("list3 empty now - " + list3.isEmpty());

        list3.add("one");
        list3.add("two");
        list3.add("three");
        list3.add("four");
        list3.add("five");
        list3.add("six");
        list3.add("seven");
        list3.add("eight");

        System.out.println("---------------------------------------------------------------");
        System.out.println("list3: " + list3 + " | size: " + list3.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("There is not such element like \"eleven\". We removed it - " + list3.remove("eleven"));
        System.out.println("list3: " + list3 + " | size: " + list3.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("Now index 0 equals to: " + list3.get(0));
        System.out.println("Removing: " + list3.set(0, "ZERO"));
        System.out.println("Setting: " + list3.get(0) + " instead");

        System.out.println("---------------------------------------------------------------");
        System.out.println("Adding \"one\" to position \"1\"");
        list3.add(1, "one");
        System.out.println("list3: " + list3 + " | size: " + list3.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println("list3 empty now - " + list3.isEmpty());
    }
}
