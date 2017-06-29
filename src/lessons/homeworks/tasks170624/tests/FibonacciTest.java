package lessons.homeworks.tasks170624.tests;

import lessons.homeworks.tasks170624.main.FibonacciTask;
import mytestframework.Asserts;

public class FibonacciTest
{
    public static void main(String[] args)
    {
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(0), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(1), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(2), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(3), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(5), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(8), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(13), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(21), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(34), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(55), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(89), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(144), true));

        System.out.println("\r\n" + Asserts.assertEquals(FibonacciTask.isFibonacci(-1), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(-2), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(-3), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(-5), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(-8), true));
        System.out.println(Asserts.assertEquals(FibonacciTask.isFibonacci(-13), true));

        System.out.println("\r\n" + Asserts.assertNotEquals(FibonacciTask.isFibonacci(4), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(6), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(7), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(9), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(145), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(143), true));

        System.out.println("\r\n" + Asserts.assertNotEquals(FibonacciTask.isFibonacci(-4), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(-6), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(-7), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(-9), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(-145), true));
        System.out.println(Asserts.assertNotEquals(FibonacciTask.isFibonacci(-143), true));
    }
}
