package lessons.homeworks.tasks170704.quick_vs_radix;

import java.util.Arrays;

public class RadixSort
{
    private static int getRadixElement(int number, int radix)
    {
        return (number / radix) % 10;
    }


    /**
     * Implemented with recursion - bad speed
     */
    private static int radix = 1;

    public static int[] sortWithRecursion(int[] array)
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
                int element = getRadixElement(n, radix);
                if (sorted && element != 0)
                {
                    sorted = false;
                }

                if (element == i)
                {
                    result[index] = n;
                    index++;
                } else
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
            return sortWithRecursion(result);
        }

        return result;
    }


    /**
     * Sort in loop - bad speed
     */
    public static int[] oneIterationSort(int[] array, int radix)
    {
        int[] result = new int[array.length];
        int resultIndex = 0;
        int unsortedBuffIndex = array.length;

        for (int i = 0; i < 10; i++)
        {
            int[] unsortedBuffer = new int[unsortedBuffIndex]; // TODO: 06.08.2017 temporary
            unsortedBuffIndex = 0;

            for (int n : array)
            {
                int element = getRadixElement(n, radix);

                if (element == i)
                {
                    result[resultIndex] = n;
                    resultIndex++;
                }
                else
                {
                    if (unsortedBuffer.length - 1 < unsortedBuffIndex)
                    {
                        break;
                    }
                    unsortedBuffer[unsortedBuffIndex] = n;
                    unsortedBuffIndex++;
                }
            }

            array = unsortedBuffer;
        }

        return result;
    }

    public static int[] sortInLoop(int[] array)
    {
        int[] result = array;

        int reach = array[0];
        for (int i : array)
        {
            reach = i > reach ? i : reach;
        }

        for (int i = 1; i <= reach; i *= 10)
        {
            result = oneIterationSort(result, i);
        }

        return result;
    }


    /**
     * Implementation which works much better: https://gist.github.com/yeison/5606963
     */


    /**
     * Local test
     */
    public static void main(String[] args)
    {
        int[] array = {5, 50, 6, 4, 100, 2, 143, 5};

        // [2, 4, 5, 5, 6, 50, 100, 143]
//        System.out.println(Arrays.toString(sortWithRecursion(array)));
        System.out.println(Arrays.toString(sortInLoop(array)));
    }
}
