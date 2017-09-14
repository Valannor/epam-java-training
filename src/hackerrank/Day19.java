package hackerrank;

import java.util.Scanner;

public class Day19
{
    interface AdvancedArithmetic
    {
        int divisorSum(int n);
    }

    //Write your code here
    static class Calculator implements AdvancedArithmetic
    {
        public int divisorSum(int n)
        {
            int res = 0;

            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                    res += i;
            }

            return res;
        }
    }

    static class Solution
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out.println(sum);
        }
    }
}
