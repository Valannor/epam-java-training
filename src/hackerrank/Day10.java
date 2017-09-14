package hackerrank;

import java.util.Scanner;

public class Day10
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            String s = Integer.toBinaryString(n);

            int max = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if (c == '1')
                    count++;
                max = max > count ? max : count;
                if (c != '1')
                {
                    count = 0;
                }
            }

            System.out.println(max);
        }
    }
}
