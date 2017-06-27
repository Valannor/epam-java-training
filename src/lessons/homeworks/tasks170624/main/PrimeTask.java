package lessons.homeworks.tasks170624.main;

public class PrimeTask
{
    public static boolean isPrime(int a)
    {
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
                return false;
        }

        return true;
    }
}
