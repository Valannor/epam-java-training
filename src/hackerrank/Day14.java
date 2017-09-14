package hackerrank;

import java.util.Scanner;

public class Day14
{
    static class Difference
    {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] elements)
        {
            this.elements = elements;
        }

        public void computeDifference()
        {
            int min = elements[0];
            int max = elements[0];
            for (int i = 0; i < elements.length; i++)
            {
                int temp = elements[i];
                min = temp < min ? temp : min;
                max = temp > max ? temp : max;
            }

            maximumDifference = max - min;
        }

    } // End of Difference class

    public static class Solution
    {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
