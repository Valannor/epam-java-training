package lessons.classworks.lesson170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary implements Iterable<Dictionary.Pair>
{
    public static class Pair
    {
        String key;
        String value;

        public Pair(String key, String value)
        {
            this.key = key;
            this.value = value;
        }
    }

    private static final int MAX = 10;
    List<Pair>[] data = new List[MAX];

    public void put(String key, String value)
    {
        int index = getHash(key);

        if (data[index] == null)
        {
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(key);
        if (pair == null)
            data[index].add(new Pair(key, value));
        else
            pair.value = value;
    }

    public String get(String key)
    {
        Pair pair = getPair(key);
        return pair == null ? null : pair.value;
    }

    private Pair getPair(String key)
    {
        int index = getHash(key);

        List<Pair> list = data[index];
        if (list == null)
        {
            return null;
        }

        for (Pair pair : list)
        {
            if (pair.key.equals(key))
                return pair;
        }

        return null;
    }

    private int getHash(String key)
    {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    @Override
    public Iterator<Pair> iterator()
    {
        return new Iterator<Pair>()
        {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext()
            {
                if (listIterator != null)
                {
                    return listIterator.hasNext();
                }


                for (currentElement++; listIterator == null && currentElement < data.length; currentElement++)
                {
                    List<Pair> list = data[currentElement];
                    if (list == null)
                    {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext())
                    {
                        continue;
                    }
                    return listIterator.hasNext();
                }

                return false;
            }

            @Override
            public Pair next()
            {
                if (!hasNext())
                {
                    throw new IllegalArgumentException();
                }

                return listIterator.next();
            }
        };
    }
}
