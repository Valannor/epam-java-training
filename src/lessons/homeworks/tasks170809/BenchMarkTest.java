package lessons.homeworks.tasks170809;

import lessons.classworks.lesson170809.Dictionary;
import mytestframework.ModernTimer;

public class BenchMarkTest
{
    public static void main(String[] args)
    {
        ModernTimer.start("Resizable HashMap test");
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        for (int i = 0; i < 100_000; i++)
        {
            myHashMap.put(Integer.toString(i), null);

            threshold(i);
        }
        System.out.println("100_000 elements added:");
        ModernTimer.stop();

        System.out.println("\r\n--------------------------------------------------");

        ModernTimer.start("No resizable Dictionary test");
        Dictionary dictionary = new Dictionary();
        for (int i = 0; i < 100_000; i++)
        {
            dictionary.put(Integer.toString(i), null);

            threshold(i);
        }
        System.out.println("100_000 elements added:");
        ModernTimer.stop();
    }

    private static void threshold(int i)
    {
        if (i == 999)
        {
            System.out.println("1_000 elements added:");
            ModernTimer.stop();
        }
        if (i == 9_999)
        {
            System.out.println("10_000 elements added:");
            ModernTimer.stop();
        }
    }
}
