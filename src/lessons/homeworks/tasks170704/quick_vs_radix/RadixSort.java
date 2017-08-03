package lessons.homeworks.tasks170704.quick_vs_radix;

import java.util.Arrays;

public class RadixSort
{
    private static int radix = 1;

    public static int[] sort(int[] array)
    {
        int[] result = new int[array.length];

        boolean sorted = true;
        int index = 0;
        int tempSize = array.length;

        for (int i = 0; i < 10; i++)
        {
            int secondaryIndex = 0;
            int[] temp = new int[tempSize];

            for (int n : array)
            {
                int element = getElement(n, radix);
                if (sorted && element != 0)
                {
                    sorted = false;
                }

                if (element == i)
                {
                    result[index] = n;
                    index++;
                }
                else
                {
                    if (temp.length - 1 < secondaryIndex)
                    {
                        break;
                    }
                    temp[secondaryIndex] = n;
                    secondaryIndex++;
                }
            }

            tempSize = secondaryIndex;
            array = temp;
        }

        if (!sorted)
        {
            radix *= 10;
            return sort(result);
        }

        return result;
    }

    private static int getElement(int number, int radix)
    {
        return (number / radix) % 10;
    }

    public static void main(String[] args)
    {
        int[] array = {5, 50, 6, 4, 100, 2, 143, 5};

        // [2, 4, 5, 5, 6, 50, 100, 143]
        System.out.println(Arrays.toString(sort(array)));
    }
}
