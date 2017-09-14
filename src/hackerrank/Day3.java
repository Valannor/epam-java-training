package hackerrank;

import java.util.*;

public class Day3
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();
            String ans = "";

            // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
            if (n % 2 == 1)
            {
                ans = "Weird";
            } else
            {
                if (n > 20 || n >= 2 && n <= 5)
                    ans = "Not Weird";
                else
                    ans = "Weird";
            }
            System.out.println(ans);
        }
    }
}
