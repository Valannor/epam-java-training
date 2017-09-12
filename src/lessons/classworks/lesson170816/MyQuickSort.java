package lessons.classworks.lesson170816;

import java.util.Arrays;

public class MyQuickSort
{
    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo; int j = hi + 1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable a, Comparable b)
    {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    private static void sortQuick(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);

        sortQuick(a, lo, j - 1);
        sortQuick(a, j + 1, hi);
    }

    public static void sort(Comparable[] array)
    {
        sortQuick(array, 0, array.length - 1);
    }

    public static void main(String[] args)
    {
        Integer[] a = {10, 3, 13, 23, 25, 9, 94, 343, 1, 26, 1, 1, 3, 4, 6, 9, 2, 5, 7, 8, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
