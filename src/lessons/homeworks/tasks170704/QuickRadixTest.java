package lessons.homeworks.tasks170704;

import mytestframework.NumberSetGenerator;
import mytestframework.Timer;

import java.util.Arrays;

public class QuickRadixTest
{
    public static void main(String[] args)
    {
        int[] array1 = NumberSetGenerator.generate(1000000);
        int[] array2 = Arrays.copyOf(array1, 1000000);

        Timer.startTimer();
        Arrays.sort(array1);
        Timer.stopTimer("Quick sort");

        Timer.startTimer();
        // TODO: 05.07.2017  
        Timer.stopTimer("Radix sort");
    }
}
