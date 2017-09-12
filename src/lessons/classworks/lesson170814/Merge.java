package lessons.classworks.lesson170814;

import java.util.Arrays;

public class Merge
{
    public static int[] mergeArrays(int[] a, int lo, int mid, int hi)
    {
        int[] temp = new int[a.length];

        for(int k = 0; k < hi; k++)
            temp[k] = a[k];

        int i = lo; int j = mid + 1;
        for (int k = 0; k < hi; k++)
        {
            if (i > mid)
                a[k] = temp[j++];
            else if (j > hi)
                a[k] = temp[i++];
            else if (temp[j] < temp[i])
                a[k] = temp[j++];
            else
                a[k] = temp[i++];
        }

        return a;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 3, 4, 6, 9, 2, 5, 7, 8, 10};
        System.out.println(Arrays.toString(mergeArrays(a,0, 4, 10)));
    }
}
