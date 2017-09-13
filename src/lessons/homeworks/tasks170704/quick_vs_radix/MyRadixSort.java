package lessons.homeworks.tasks170704.quick_vs_radix;

import java.util.Arrays;

public class MyRadixSort
{
    private static final int RADIX = 10;

    public static void radixSort(int[] array, int range)
    {
        for (int exp = 1; exp <= range; exp *= RADIX)
        {
            countSort(array, exp);
        }
    }

    private static void countSort(int[] array, int exp)
    {
        int[] counters = new int[RADIX];
        int[] aux = new int[array.length];

        for (int i : array)
        {
            counters[i / exp % RADIX]++;
        }

        for (int i = 1; i < RADIX; i++)
        {
            counters[i] += counters[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            int element = array[i];
            int counterPointer = element / exp % RADIX;
            int sortedIndex = counters[counterPointer]--;

            aux[sortedIndex - 1] = element;
        }

        System.arraycopy(aux, 0, array, 0, aux.length);
    }

    public static void main(String[] args)
    {
        int[] a = {10, 3, 13, 23, 25, 9, 94, 343, 1, 26, 1, 1, 3, 4, 6, 9, 2, 5, 7, 8, 10};
        radixSort(a, 1000);
        System.out.println(Arrays.toString(a));
    }
}
