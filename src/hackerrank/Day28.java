package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28
{
    public static class Solution
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();

            ArrayList<String> list = new ArrayList<>();
            Pattern pattern = Pattern.compile(".+@gmail\\.com$");

            for (int a0 = 0; a0 < N; a0++)
            {
                String firstName = in.next();
                String emailID = in.next();

                Matcher matcher = pattern.matcher(emailID);
                if (matcher.find())
                {
                    list.add(firstName);
                }
            }

            Collections.sort(list);
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}
