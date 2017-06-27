package lessons.homeworks.tasks170624.main;

public class ModTask
{
    public static int mod(int a, int b)
    {
        int c = 0;

        for (int i = a; i > 0; i -= b)
        {
            c = i;
        }

        if (c - b == 0)
            c = 0;

        return c;
    }
}
