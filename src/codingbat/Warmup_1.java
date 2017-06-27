package codingbat;

public class Warmup_1
{
    public boolean sleepIn(boolean weekday, boolean vacation)
    {
        return (!weekday || vacation);
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b)
    {
        if (a != b)
            return a + b;

        return 2 * (a + b);
    }

    public int diff21(int n)
    {
        int result = 21 - n;

        if (result < 0)
            result *= -2;

        return result;
    }

    public boolean parrotTrouble(boolean talking, int hour)
    {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b)
    {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n)
    {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative)
    {
        if (negative)
        {
            return (a < 0 && b < 0);
        } else
        {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str)
    {
        if (!str.startsWith("not"))
            str = "not " + str;

        return str;
    }

    public String missingChar(String str, int n)
    {
        char[] c = new char[str.length() - 1];

        int j = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (i != n)
            {
                c[j] = str.toCharArray()[i];
                j++;
            }
        }

        return new String(c);

//        String front = str.substring(0, n);
//        String back = str.substring(n+1, str.length());
//        return front + back;
    }

    public String frontBack(String str)
    {
        String result = str;

        if (str.length() > 1)
        {
            String front = str.substring(0, 1);
            String middle = str.substring(1, str.length() - 1);
            String back = str.substring(str.length() - 1, str.length());

            result = back + middle + front;
        }

        return result;

//        if (str.length() <= 1) return str;
//        String mid = str.substring(1, str.length()-1);
//        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    public String front3(String str)
    {
        String result = str;

        if (str.length() > 3)
            result = str.substring(0, 3);

        return result + result + result;
    }

    public String backAround(String str)
    {
        char c = str.charAt(str.length() - 1);

        return c + str + c;
    }

    public boolean or35(int n)
    {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str)
    {
        String front;

        if (str.length() > 2)
            front = str.substring(0, 2);
        else
            front = str;

        return front + str + front;
    }

    public boolean startHi(String str)
    {
        return str.startsWith("hi");
    }

    public static void main(String[] args)
    {
    }
}
