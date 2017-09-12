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

        ArrayList<Integer> arrayList = new ArrayList<>();
        NumberSetGenerator.fillCollection(arrayList, array1);
        Collections.sort(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        NumberSetGenerator.fillCollection(linkedList, array1);
        Collections.sort(linkedList);

        TreeSet<Integer> treeSet = new TreeSet<>();
        NumberSetGenerator.fillCollection(treeSet, array1);

        //Tests
        ModernTimer.start("Binary search for ArrayList");
        System.out.println(Collections.binarySearch(arrayList, 123));
        ModernTimer.stop();

        ModernTimer.start("Binary search for LinkedList");
        System.out.println(Collections.binarySearch(linkedList, 123));
        ModernTimer.stop();

        ModernTimer.start("Binary search for TreeSet");
        System.out.println(treeSet.contains(123));
        ModernTimer.stop();
    }
}
