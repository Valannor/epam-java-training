package lessons.classworks.lesson170712;

public class StringStackTest
{
    public static void main(String[] args)
    {
        StringStack stack = new StringStack();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.tos());

        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
