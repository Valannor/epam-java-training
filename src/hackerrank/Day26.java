package hackerrank;

import java.util.Scanner;

public class Day26
{
    public static class Solution
    {
        public static void main(String[] args)
        {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            String actual = scanner.nextLine();
            String expect = scanner.nextLine();

            String[] act = actual.split(" ");
            String[] exp = expect.split(" ");

            int actD = Integer.parseInt(act[0]);
            int actM = Integer.parseInt(act[1]);
            int actY = Integer.parseInt(act[2]);

            int expD = Integer.parseInt(exp[0]);
            int expM = Integer.parseInt(exp[1]);
            int expY = Integer.parseInt(exp[2]);

            int n = 0;
            if (actY <= expY && actM <= expM && actD <= expD)
                n = 0;
            if (actY == expY && actM == expM && actD > expD)
            {
                n = (actD - expD) * 15;
            }
            if (actY == expY && actM > expM)
            {
                n = (actM - expM) * 500;
            }
            if (actY > expY)
                n = 10000;

            System.out.println(n);
        }
    }
}
