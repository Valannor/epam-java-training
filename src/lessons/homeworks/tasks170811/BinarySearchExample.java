package lessons.homeworks.tasks170811;

import mytestframework.ModernTimer;
import mytestframework.NumberSetGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class BinarySearchExample
{
    public static void main(String[] args)
    {
        //Preparations
        int[] array1 = NumberSetGenerator.generate(1_000_000);
        int key = 123;


        //ArrayList test
        ModernTimer.start("Binary search in ArrayList");

        ArrayList<Integer> arrayList = new ArrayList<>();
        NumberSetGenerator.fillCollection(arrayList, array1);
        Collections.sort(arrayList);
        System.out.println(Collections.binarySearch(arrayList, key));

        ModernTimer.stop();


        //LinkedList test
        ModernTimer.start("Binary search in LinkedList");

        LinkedList<Integer> linkedList = new LinkedList<>();
        NumberSetGenerator.fillCollection(linkedList, array1);
        Collections.sort(linkedList);
        System.out.println(Collections.binarySearch(linkedList, key));

        ModernTimer.stop();


        //TreeSet test
        ModernTimer.start("Binary search in TreeSet");

        TreeSet<Integer> treeSet = new TreeSet<>();
        NumberSetGenerator.fillCollection(treeSet, array1);
        System.out.println(treeSet.contains(key));

        ModernTimer.stop();
    }
}
