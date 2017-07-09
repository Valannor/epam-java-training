package lessons.classworks.lesson170624;

import mytestframework.Asserts;

public class ClassWork_170624
{
    public static void main(String[] args)
    {
        Asserts.assertEquals(MathUnit.maxValue(3, 5), 5);
        Asserts.assertEquals(MathUnit.maxValue(5, 3), 5);
        Asserts.assertEquals(MathUnit.maxValue(5, 5), 5);
        Asserts.assertEquals(MathUnit.maxValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE);

        Asserts.assertNotEquals(MathUnit.maxValue(3, 5), 3);
        Asserts.assertNotEquals(MathUnit.maxValue(5, 3), 3);
        Asserts.assertNotEquals(MathUnit.maxValue(5, 5), 3);
        Asserts.assertNotEquals(MathUnit.maxValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE);

        Asserts.assertEquals(MathUnit.minValue(3, 5), 3);
        Asserts.assertEquals(MathUnit.minValue(5, 3), 3);
        Asserts.assertEquals(MathUnit.minValue(5, 5), 5);
        Asserts.assertEquals(MathUnit.minValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE);

        Asserts.assertNotEquals(MathUnit.minValue(3, 5), 5);
        Asserts.assertNotEquals(MathUnit.minValue(5, 3), 5);
        Asserts.assertNotEquals(MathUnit.minValue(5, 5), 3);
        Asserts.assertNotEquals(MathUnit.minValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE);
    }
}
