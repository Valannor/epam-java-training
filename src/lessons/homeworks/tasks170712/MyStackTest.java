package lessons.homeworks.tasks170712;

import mytestframework.Asserts;

public class MyStackTest
{
    public static void main(String[] args)
    {
        MyStack<String> stack = new MyStack<>();

        Asserts.assertEquals(stack.push("one"), true);
        stack.push("two");
        stack.push("three");
        Asserts.assertNotEquals(stack.push("four"), true);

        Asserts.assertEquals(stack.size(), 3);
        Asserts.assertNotEquals(stack.size(), 4);

        Asserts.assertEquals(stack.pop(), "three");
        Asserts.assertNotEquals(stack.pop(), "three");
        stack.pop();
        Asserts.assertEquals(stack.pop() == null, true);
        Asserts.assertNotEquals(stack.pop() == null, false);


    }
}
