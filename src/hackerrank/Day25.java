package hackerrank;

import java.util.Scanner;

public class Day25
{
    public static class Solution
    {
        public static void main(String[] args)
        {
        /* Enter your code here. */
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int[] buff = new int[T];
            int count = -1;
            while (T-- > 0)
            {
                int ele = sc.nextInt();
                buff[++count] = ele;
            }

            for (int i = 0; i < buff.length; i++)
            {
                isPrime(buff[i]);
            }
        }

        public static void isPrime(int n)
        {
            if (n < 2)
            {
                System.out.println("Not prime");
                return;
            }

            int max = n > 1000 ? (int) Math.sqrt(n) : n;
            for (int i = 2; i < max; i++)
            {
                if (n % i == 0)
                {
                    System.out.println("Not prime");
                    return;
                }
            }

            System.out.println("Prime");
        }
    }
}
