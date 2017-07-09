package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.SignTask;
import mytestframework.Asserts;

public class SignTest
{
    public static void main(String[] args)
    {
        Asserts.assertEquals(SignTask.sign(-10), -1);
        Asserts.assertEquals(SignTask.sign(10), 1);
        Asserts.assertEquals(SignTask.sign(0), 0);
        Asserts.assertEquals(SignTask.sign(Integer.MIN_VALUE), -1);
        Asserts.assertEquals(SignTask.sign(Integer.MAX_VALUE), 1);

        Asserts.assertNotEquals(SignTask.sign(-10), 1);
        Asserts.assertNotEquals(SignTask.sign(10), -1);
        Asserts.assertNotEquals(SignTask.sign(0), 1);
        Asserts.assertNotEquals(SignTask.sign(Integer.MIN_VALUE), 1);
        Asserts.assertNotEquals(SignTask.sign(Integer.MAX_VALUE), -1);
    }
}
