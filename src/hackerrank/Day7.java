package hackerrank;

import java.util.Scanner;

public class Day7
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = in.nextInt();
            }
            in.close();

            String out = "";
            for (int i = arr.length - 1; i >= 0; i--)
            {
                if (i != 0)
                    out += arr[i] + " ";
                else
                    out += arr[i];
            }

            System.out.println(out);
        }
    }
}
