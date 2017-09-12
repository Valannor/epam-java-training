package lessons.homeworks.tasks170811;

import mytestframework.ModernTimer;
import mytestframework.NumberSetGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MyBinaryTest
{
    public static void main(String[] args)
    {
        //Preparations
        int[] array1 = NumberSetGenerator.generate(1_000_000);
        int key = 190_333;

        System.out.println("COLLECTIONS BINARY SEARCH:\r\n");

        //ArrayList test
        ModernTimer.start("Binary search in ArrayList 1");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        NumberSetGenerator.fillCollection(arrayList1, array1);
        Collections.sort(arrayList1);
        System.out.println(Collections.binarySearch(arrayList1, key));

        ModernTimer.stop();


        //LinkedList test
        ModernTimer.start("Binary search in LinkedList 1");

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        NumberSetGenerator.fillCollection(linkedList1, array1);
        Collections.sort(linkedList1);
        System.out.println(Collections.binarySearch(linkedList1, key));

        ModernTimer.stop();


        System.out.println("\r\nMY BINARY SEARCH:\r\n");

        //ArrayList test
        ModernTimer.start("Binary search in ArrayList 2");

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        NumberSetGenerator.fillCollection(arrayList2, array1);
        Collections.sort(arrayList2);
        System.out.println(MyBinarySearch.search(arrayList2, key));

        ModernTimer.stop();


        //LinkedList test
        ModernTimer.start("Binary search in LinkedList 2");

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        NumberSetGenerator.fillCollection(linkedList2, array1);
        Collections.sort(linkedList2);
        System.out.println(MyBinarySearch.search(linkedList2, key));

        ModernTimer.stop();
    }
}
