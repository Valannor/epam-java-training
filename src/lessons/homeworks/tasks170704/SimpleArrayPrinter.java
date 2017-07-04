package lessons.homeworks.tasks170704;

public class SimpleArrayPrinter <T>
{
    public void printArray(T[] array)
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
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] b = new String[8];
        String[] c = {"a", "b", "c"};

        SimpleArrayPrinter arrayPrinter = new SimpleArrayPrinter();
        arrayPrinter.printArray(a);
        arrayPrinter.printArray(b);
        arrayPrinter.printArray(c);
    }
}
