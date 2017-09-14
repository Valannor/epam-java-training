package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8
{
    static class Solution
    {
        public static void main(String[] argh)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++)
            {
                String name = in.next();
                int phone = in.nextInt();
                map.put(name, phone);
            }
            while (in.hasNext())
            {
                String s = in.next();
                Integer numb = map.get(s);

                if (numb == null)
                    System.out.println("Not found");
                else
                    System.out.println(s + "=" + numb);
            }
            in.close();
        }
    }
}
