package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.ModTask;
import mytestframework.Asserts;

public class ModTest
{
    public static void main(String[] args)
    {
        System.out.println(Asserts.assertEquals(ModTask.mod(5, 3), 2));
        System.out.println(Asserts.assertEquals(ModTask.mod(9, 3), 0));

        System.out.println(Asserts.assertNotEquals(ModTask.mod(5, 4), 5));
        System.out.println(Asserts.assertNotEquals(ModTask.mod(9, 3), -1));

    }
}
