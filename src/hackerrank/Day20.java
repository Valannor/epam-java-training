package hackerrank;

import java.util.Scanner;

public class Day20
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++)
            {
                a[a_i] = in.nextInt();
            }

            int numberOfAllSwaps = 0;
            // Write Your Code Here
            for (int i = 0; i < n; i++)
            {

                // Track number of elements swapped during a single array traversal
                int numberOfSwaps = 0;
                for (int j = 0; j < n - 1; j++)
                {

                    // Swap adjacent elements if they are in decreasing order
                    if (a[j] > a[j + 1])
                    {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        numberOfSwaps++;
                    }
                }

                // If no elements were swapped during a traversal, array is sorted
                if (numberOfSwaps == 0)
                {
                    break;
                }

                numberOfAllSwaps += numberOfSwaps;
            }

            System.out.println("Array is sorted in " + numberOfAllSwaps + " swaps." +
                    "\r\nFirst Element: " + a[0] +
                    "\r\nLast Element: " + a[a.length - 1]);
        }
    }
}
