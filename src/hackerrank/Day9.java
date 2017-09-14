package hackerrank;

import java.util.Scanner;

public class Day9
{
    public static class Solution
    {
        static int factorial(int n)
        {
            if (n == 1)
                return 1;
            return n * factorial(n - 1);
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int result = factorial(n);
            System.out.println(result);
        }
    }
}
