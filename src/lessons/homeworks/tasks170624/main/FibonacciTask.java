package lessons.homeworks.tasks170624.main;

public class FibonacciTask
{
    public static boolean isFibonacci(int a)
    {
        if (a == 0 || a == 1)
        {
            return true;
        }
        if (a < 0)
        {
            a *= -1;
        }

        int fib_prev = 0;
        int fib_new = 1;

        for (int i = 0; fib_new < a; i++)
        {
            int j = fib_new;

            fib_new = fib_new + fib_prev;
            fib_prev = j;
        }

        return fib_new == a;
    }
}
