package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.PrimeTask;
import mytestframework.Asserts;

public class PrimeTest
{
    public static void main(String[] args)
    {
        Asserts.assertEquals(PrimeTask.isPrime(1), true);
        Asserts.assertEquals(PrimeTask.isPrime(13), true);
        Asserts.assertEquals(PrimeTask.isPrime(4), false);
        Asserts.assertEquals(PrimeTask.isPrime(12), false);
//        Asserts.assertEquals(PrimeTask.isPrime(Integer.MAX_VALUE), true);

        Asserts.assertNotEquals(PrimeTask.isPrime(1), false);
        Asserts.assertNotEquals(PrimeTask.isPrime(13), false);
        Asserts.assertNotEquals(PrimeTask.isPrime(4), true);
        Asserts.assertNotEquals(PrimeTask.isPrime(12), true);
    }
}
