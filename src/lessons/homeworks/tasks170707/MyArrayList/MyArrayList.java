package lessons.homeworks.tasks170707.MyArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>
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

    private int size = 0;

    public boolean add(E obj)
    {
        if (elements.length == (size))
        {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = obj;

        return true;
    }

    public void add(int index, E obj)
    {
        if (elements.length == (size))
        {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        System.arraycopy(elements, index, elements, index + 1, size++);

        elements[index] = obj;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean remove(E obj)
    {
        for (int i = 0; i < size; i++)
        {
            Object element = elements[i];

            if (element == null)
            {
                return false;
            }

            if (element.equals(obj))
            {
                System.arraycopy(elements, i + 1, elements, i, --size - i);
                elements[size] = null;

                return true;
            }
        }

        return false;
    }

    public boolean remove(int index) throws IndexOutOfBoundsException
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null;

        return true;
    }

    public E get(int index)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        return (E) elements[index];
    }

    public E set(int index, Object obj)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Object old = elements[index];
        elements[index] = obj;

        return (E) old;
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

    @Override
    public Iterator iterator()
    {
        Iterator<E> iterator = new Iterator<E>()
        {
            int cursor = 0;

            @Override
            public boolean hasNext()
            {
                if (cursor < elements.length - 1 && elements[cursor] != null)
                    return true;

                return false;
            }

            @Override
            public E next()
            {
                return (E) elements[cursor++];
            }
        };

        return iterator;
    }
}
