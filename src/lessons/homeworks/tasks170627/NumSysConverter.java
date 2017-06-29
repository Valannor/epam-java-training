package lessons.homeworks.tasks170627;

public class NumSysConverter
{
    public static String toBinary(int a)
    {
        return universalSystem(a, 2);
    }

    public static String toOctal(int a)
    {
        return universalSystem(a, 8);
    }

    public static String toHex(int a)
    {
        return universalSystem(a, 16);
    }

    public static String universalSystem(int a, int base) throws StringIndexOutOfBoundsException
    {
        String posNeg = "";
        if (a < 0)
        {
            a *= -1;
            posNeg = "-";
        }

        String result = "";

        while (a >= base)
        {
            int balance = a % base;
            if (balance > 9)
            {
                result += "abcdefghijklmnopqrstuvwxyz".charAt(balance - 10);
            }
            else
            {
                result += balance;
            }

            a = getDivider(a, balance, base);
        }

        result += a + posNeg;

        return new StringBuilder(result).reverse().toString();
    }

    private static int getDivider(int dividend, int balance, int base)
    {
        return (dividend - balance) / base;
    }
}
