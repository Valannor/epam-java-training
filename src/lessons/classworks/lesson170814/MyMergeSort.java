package lessons.classworks.lesson170814;

import java.util.Arrays;

public class MyMergeSort
{
    private static void mergeArrays(Comparable[] a, Comparable[] aux, int lo, int hi, int mid)
    {
        for(int i = lo; i <= hi; i++)
            aux[i] = a[i];

        int i = lo; int j = mid + 1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0)
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    private static void sortMerge(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;
        sortMerge(a, aux, lo, mid);
        sortMerge(a, aux, mid + 1, hi);
        mergeArrays(a, aux, lo, hi, mid);
    }

    public static void sort(Comparable[] a)
    {
        Comparable[] aux = new Comparable[a.length];
        sortMerge(a, aux, 0, a.length - 1);
    }

    public static void main(String[] args)
    {
        Integer[] a = {10, 3, 13, 23, 25, 9, 94, 343, 1, 26, 1, 1, 3, 4, 6, 9, 2, 5, 7, 8, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
