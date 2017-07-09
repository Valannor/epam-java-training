package mytestframework;

public class Asserts
{
    public static boolean assertEquals(String actual, String expected)
    {
        boolean equals = actual.equals(expected);
        if (!equals)
        {
            System.err.println("Test FAILED: expected \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected \"" + expected + "\", actual \"" + actual + "\"");
        }

        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected)
    {
        boolean notEquals = !actual.equals(expected);
        if (!notEquals)
        {
            System.err.println("Test FAILED: expected NOT \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected NOT \"" + expected + "\", actual \"" + actual + "\"");
        }

        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected)
    {
        boolean equals = actual == expected;
        if (!equals)
        {
            System.err.println("Test FAILED: expected \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected \"" + expected + "\", actual \"" + actual + "\"");
        }

        return equals;
    }

    public static boolean assertNotEquals(int actual, int expected)
    {
        boolean notEquals = actual != expected;
        if (!notEquals)
        {
            System.err.println("Test FAILED: expected NOT \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected NOT \"" + expected + "\", actual \"" + actual + "\"");
        }

        return notEquals;
    }

    public static boolean assertEquals(boolean actual, boolean expected)
    {
        boolean equals = actual == expected;
        if (!equals)
        {
            System.err.println("Test FAILED: expected \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected \"" + expected + "\", actual \"" + actual + "\"");
        }

        return equals;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected)
    {
        boolean notEquals = actual != expected;
        if (!notEquals)
        {
            System.err.println("Test FAILED: expected NOT \"" + expected + "\", but actual \"" + actual + "\"");
        } else
        {
            System.out.println("Test PASSED: expected NOT \"" + expected + "\", actual \"" + actual + "\"");
        }

        return notEquals;
    }
}