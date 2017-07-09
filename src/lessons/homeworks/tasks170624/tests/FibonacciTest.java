package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.FibonacciTask;
import mytestframework.Asserts;

public class FibonacciTest
{
    public static void main(String[] args)
    {
        Asserts.assertEquals(FibonacciTask.isFibonacci(0), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(1), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(2), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(3), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(5), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(8), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(13), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(21), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(34), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(55), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(89), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(144), true);

        System.out.println();
        Asserts.assertEquals(FibonacciTask.isFibonacci(-1), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(-2), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(-3), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(-5), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(-8), true);
        Asserts.assertEquals(FibonacciTask.isFibonacci(-13), true);

        System.out.println();
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(4), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(6), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(7), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(9), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(145), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(143), true);

        System.out.println();
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-4), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-6), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-7), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-9), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-145), true);
        Asserts.assertNotEquals(FibonacciTask.isFibonacci(-143), true);
    }
}
