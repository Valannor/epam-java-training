package hackerrank;

import java.util.Scanner;

public class Day6
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int loop = scan.nextInt();

            String s = "";
            for (int i = 0; i <= loop; i++)
            {
                s = scan.nextLine();

                if (s.length() > 0)
                {
                    String a = "";
                    String b = "";
                    for (int j = 0; j < s.length(); j++)
                    {
                        if (j % 2 == 0)
                            b += s.charAt(j);
                        else
                            a += s.charAt(j);
                    }

                    System.out.println(b + " " + a);
                }
            }
        }
    }
}
