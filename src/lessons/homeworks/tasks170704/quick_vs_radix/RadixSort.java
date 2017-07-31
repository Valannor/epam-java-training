package lessons.homeworks.tasks170704.quick_vs_radix;

public class RadixSort
{
    public static int[] sort(int[] array)
    {
        // TODO: 31.07.2017
        int[] result = new int[array.length];



        return result;
    }

    private static int getElement(int number, int level)
    {
        int result = number / cut(level);
        result %= 10;

        return result;
    }

    private static int cut(int level)
    {
        int n = 10;
        int result = 1;

        for (int i = 1; i < level; i++)
        {
            result *= n;
        }

        return result;
    }

    public static void main(String[] args)
    {
        // 5
        System.out.println(getElement(256, 2));
        // 0
        System.out.println(getElement(6, 2));

//        int[] array = {5, 50, 6, 4, 100, 2, 143, 5};
//
//        // [2, 4, 5, 5, 6, 50, 100, 143]
//        System.out.println(Arrays.toString(sort(array)));
    }
}
