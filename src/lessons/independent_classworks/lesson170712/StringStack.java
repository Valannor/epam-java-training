package lessons.independent_classworks.lesson170712;

import java.util.Arrays;

public class StringStack
{
    private static final int DEFAULT_MAX_SIZE = 3;
    private String[] elements;
    private int size;

    public StringStack()
    {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize)
    {
        this.elements = new String[maxSize];
    }

    public boolean push(String element)
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

    public String pop()
    {
        if (size <= 0)
        {
            return null; //stack underflow
        }

        String result = elements[--size];
        elements[size] = null;

        return result;
    }

    public String tos()
    {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString()
    {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
