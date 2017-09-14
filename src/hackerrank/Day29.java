package hackerrank;

import java.util.Scanner;

public class Day29
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for (int a0 = 0; a0 < t; a0++)
            {
                int n = in.nextInt();
                int k = in.nextInt();

                int res = 0;
                for (int i = 1; i < n; i++)
                {
                    for (int j = i + 1; j <= n; j++)
                    {
                        int cur = i & j;
                        if (cur > res && cur < k)
                            res = cur;
                    }
                }

                System.out.println(res);
            }
        }
    }
}
