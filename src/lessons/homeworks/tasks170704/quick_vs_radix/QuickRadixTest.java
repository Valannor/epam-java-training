package lessons.homeworks.tasks170704.quick_vs_radix;

import mytestframework.NumberSetGenerator;
import mytestframework.Timer;

import java.util.Arrays;

public class QuickRadixTest
{
    public static void main(String[] args)
    {
        int[] array1 = NumberSetGenerator.generate(1_000_000);
        int[] array2 = Arrays.copyOf(array1, 1_000_000);
        int[] array3 = Arrays.copyOf(array1, 1_000_000);

        Timer.startTimer();
        Arrays.sort(array1);
        System.out.println(Timer.stopTimer("Quick sort"));

        Timer.startTimer();
        array2 = RadixSort.sortWithRecursion(array2);
        System.out.println(Timer.stopTimer("Radix sortWithRecursion"));

        Timer.startTimer();
        array3 = RadixSort.sortInLoop(array3);
        System.out.println(Timer.stopTimer("Radix sortInLoop"));

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array2, array3));

        //It works, but slower than regular quick sort.
    }
}
