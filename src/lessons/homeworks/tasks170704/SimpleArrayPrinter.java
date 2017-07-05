package lessons.homeworks.tasks170704;

public class SimpleArrayPrinter
{
    public static void printArray(int[] array)
    {
        System.out.print("[");

        int i = 0;
        for (int element : array)
        {
            if (i == array.length - 1)
            {
                System.out.println(element + "]");
                continue;
            }

            System.out.print(element + ", ");
            i++;
        }
    }

    public static <T> void printArray(T[] array)
    {
        System.out.print("[");

        int i = 0;
        for (T element : array)
        {
            if (i == array.length - 1)
            {
                System.out.println(element + "]");
                continue;
            }

            System.out.print(element + ", ");
            i++;
        }
    }

    public static void main(String[] args)
    {
        String[] c = {"a", "b", "c"};
        int[] d = new int[10];

        printArray(c);
        printArray(d);
    }
}
