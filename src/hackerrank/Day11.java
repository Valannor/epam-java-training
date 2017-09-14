package hackerrank;

import java.util.Scanner;

public class Day11
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int arr[][] = new int[6][6];
            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < 6; j++)
                {
                    arr[i][j] = in.nextInt();
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 4; i++)
            {
                int[] n1 = arr[i];
                int[] n2 = arr[i + 1];
                int[] n3 = arr[i + 2];
                for (int j = 0; j < 4; j++)
                {
                    int count = 0;
                    for (int k = 0; k < 3; k++)
                    {
                        if (k == 1)
                            count += n2[j + k];

                        count += n1[j + k];
                        count += n3[j + k];
                    }

                    max = max > count ? max : count;
                }
            }

            System.out.println(max);
        }
    }
}
