package hackerrank;

import java.util.Scanner;

public class Day5
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int i = 1; i <= 10; i++)
            {
                int out = n * i;
                System.out.println(n + " x " + i + " = " + out);
            }
        }
    }
}
