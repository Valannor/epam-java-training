package lessons.homeworks.tasks170707.MyArrayList;

import java.util.Arrays;

public class MyArrayList <E>
{
    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;

    public MyArrayList(E[] elements)
    {
        this.elements = elements;
    }

    public MyArrayList()
    {
        elements = new Object[DEFAULT_SIZE];
    }

    int size = 0;

    public boolean add(E obj)
    {
        if (elements.length == (size))
        {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = obj;

        return true;
    }

    public boolean remove(E obj)
    {
        return false;
    }

    public boolean remove(int index) throws IndexOutOfBoundsException
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        System.arraycopy(elements, index + 1, elements, index, --size - index);

        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < size; i++)
        {
            sb.append(elements[i]);

            if (i != size - 1)
            {
                sb.append(',');
            }
        }

        sb.append(']');

        return sb.toString();
    }
}
