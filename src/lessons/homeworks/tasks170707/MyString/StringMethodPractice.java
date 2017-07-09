package lessons.homeworks.tasks170707.MyString;

public class StringMethodPractice
{
    /**
     * Extremely slow analog of original trim method in String class. Created to show that we have an alternative
     *
     * @param s
     */
    public static String trim(String s)
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


    /**
     * Hope no one will ever see this
     * @param original
     * @param target
     * @param replacement
     * @return
     */
    public static String replace(String original, CharSequence target, CharSequence replacement)
    {
        if (original.length() == 0 && original.length() != target.length())
            return original;

        if (original.length() == 0 && original.length() == target.length())
            return "!";

        StringBuilder result = new StringBuilder();

        FIRST:
        for (int i = 0; i < original.length(); i++)
        {
            int counter = 0;

            if (target.length() != 0)
            {
                for (int j = 0; j < target.length(); j++)
                {
                    int origIndex = i + j;
                    if (origIndex >= original.length() || original.charAt(origIndex) != target.charAt(j))
                    {
                        result.append(original.charAt(i));
                        continue FIRST;
                    }

                    counter = j;
                }
            } else
            {
                if (i == 0)
                {
                    result.append(replacement);
                }

                result.append(original.charAt(i));
            }

            result.append(replacement);
            i += counter;
        }

        return result.toString();
    }
}
