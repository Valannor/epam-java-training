package lessons.homeworks.tasks170712;

public class MyStack <E>
{
    private static final int DEFAULT_MAX_SIZE = 3;
    private E[] elements;
    private int size;

    public MyStack()
    {
        this(DEFAULT_MAX_SIZE);
    }

    public MyStack(int maxSize)
    {
        elements = (E[]) new Object[maxSize];
    }

    public boolean push(E element)
    {
        if (size >= elements.length)
        {
            return false; //stack overflow
        }

        elements[size++] = element;
        return true;
    }

    public int size()
    {
        return size;
    }
}
