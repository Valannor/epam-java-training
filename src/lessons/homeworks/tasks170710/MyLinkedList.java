package lessons.homeworks.tasks170710;

public class MyLinkedList <E>
{
    Node<E> first;

    Node<E> last;

    int size;

    public void add(E value)
    {
        Node node = new Node(value, null);

        if (first == null)
        {
            first = node;
        } else
        {
            last.next = node;
        }

        last = node;

        size++;
    }

    public E remove(int index)
    {
        E removedElement = null;
        Node<E> prev = null;
        Node<E> current = first;

        for (int i = 0; i < size; i++)
        {
            if (index == i)
            {
                if (prev == null)
                {
                    removedElement = first.value;
                    first = first.next;
                    break;
                }
                else
                {
                    removedElement = current.value;
                    prev.next = current.next;
                }
            }

            prev = current;
            current = current.next;
        }

        return removedElement;
    }

    public boolean remove(E element)
    {
        Node prev = null;
        Node current = first;

        while (current != null)
        {
            if (current.value.equals(element))
            {
                if (prev == null)
                {
                    first = current.next;
                } else
                {
                    prev.next = current.next;
                }
                size--;

                return true;
            }
            prev = current;
            current = current.next;
        }

        if (first == null)
        {
            last = null;
        }

        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        if (first != null)
        {
            builder.append(first.value);
            Node current = first.next;

            while (current != null)
            {
                builder.append(", ").append(current.value);

                current = current.next;
            }
        }

        builder.append("]");

        return builder.toString();
    }

    private class Node<E>
    {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
        }
    }


}
