package lessons.classworks.lesson170707;

import java.util.Collections;

public class StringMethodPractice
{
    public static void main(String[] args)
    {
        String s1 = "   H e l l o   ";

        System.out.println(trim(s1));
    }

    private static String trim(String s)
    {
        if (s == null || s.length() == 0)
            return s;

        if (s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1)
            return s;

        boolean go = false;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c != ' ' && !go)
            {
                index1 = i;
                go = true;
            }
            if (c != ' ' && go)
            {
                index2 = i;
            }
        }

        return s.substring(index1, index2 + 1);
    }
}
