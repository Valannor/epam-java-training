package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.PrimeTask;
import mytestframework.Asserts;

public class PrimeTest
{
    public static void main(String[] args)
    {
        System.out.println(Asserts.assertEquals(PrimeTask.isPrime(1), true));
        System.out.println(Asserts.assertEquals(PrimeTask.isPrime(13), true));
        System.out.println(Asserts.assertEquals(PrimeTask.isPrime(4), false));
        System.out.println(Asserts.assertEquals(PrimeTask.isPrime(12), false));
//        System.out.println(Asserts.assertEquals(PrimeTask.isPrime(Integer.MAX_VALUE), true));

        System.out.println(Asserts.assertNotEquals(PrimeTask.isPrime(1), false));
        System.out.println(Asserts.assertNotEquals(PrimeTask.isPrime(13), false));
        System.out.println(Asserts.assertNotEquals(PrimeTask.isPrime(4), true));
        System.out.println(Asserts.assertNotEquals(PrimeTask.isPrime(12), true));
    }
}
