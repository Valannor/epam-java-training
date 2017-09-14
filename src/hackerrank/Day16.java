package hackerrank;

import java.util.Scanner;

public class Day16
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String S = in.next();

            int i = 0;
            try
            {
                i = Integer.parseInt(S);
            } catch (Exception e)
            {
                System.out.println("Bad String");
                return;
            }
            System.out.println(i);
        }
    }
}
