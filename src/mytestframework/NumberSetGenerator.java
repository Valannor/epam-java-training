package mytestframework;

import java.util.Collection;
import java.util.Random;

public class NumberSetGenerator
{
    private static int Size;

    public static int[] generate(int size)
    {
        Size = size;

        int[] numberSet = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++)
        {
            numberSet[i] = random.nextInt(size);
        }

        return numberSet;
    }

    public static void fillCollection(Collection<Integer> list, int[] array)
    {
        for (int i : array)
        {
            list.add(i);
        }
    }

    public static int getSize()
    {
        return Size;
    }

    public static void setSize(int size)
    {
        NumberSetGenerator.Size = size;
    }
}
