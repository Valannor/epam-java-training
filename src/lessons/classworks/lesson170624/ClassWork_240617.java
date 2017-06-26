package lessons.classworks.lesson170624;

public class ClassWork_240617
{
    public static void main(String[] args)
    {
        System.out.println(SimpleUnit.assertEquals(MathUnit.maxValue(3, 5), 5));
        System.out.println(SimpleUnit.assertEquals(MathUnit.maxValue(5, 3), 5));
        System.out.println(SimpleUnit.assertEquals(MathUnit.maxValue(5, 5), 5));
        System.out.println(SimpleUnit.assertEquals(MathUnit.maxValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

        System.out.println(SimpleUnit.assertNotEquals(MathUnit.maxValue(3, 5), 3));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.maxValue(5, 3), 3));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.maxValue(5, 5), 3));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.maxValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));

        System.out.println(SimpleUnit.assertEquals(MathUnit.minValue(3, 5), 3));
        System.out.println(SimpleUnit.assertEquals(MathUnit.minValue(5, 3), 3));
        System.out.println(SimpleUnit.assertEquals(MathUnit.minValue(5, 5), 5));
        System.out.println(SimpleUnit.assertEquals(MathUnit.minValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));

        System.out.println(SimpleUnit.assertNotEquals(MathUnit.minValue(3, 5), 5));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.minValue(5, 3), 5));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.minValue(5, 5), 3));
        System.out.println(SimpleUnit.assertNotEquals(MathUnit.minValue(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));
    }
}
