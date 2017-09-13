package lessons.homeworks.tasks170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyHashMap<K, V> implements Iterable<MyHashMap.Pair>
{
    private static final int LOAD_FACTOR = 1000; //gives the best performance

    private static int mapSize = 10;
    private static int counter;

    public static class Pair<K, V>
    {
        K key;
        V value;

        public Pair(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
    }

    List<Pair>[] data = new List[mapSize];

    private void resize()
    {
        counter = 0;
        mapSize *= 100_000; //gives the best performance

        List<Pair>[] old = data;
        data = new List[mapSize];

        for (List<Pair> tab : old)
        {
            if (tab != null)
            {
                for (Pair pair : tab)
                {
                    put((K)pair.key, (V)pair.value);
                }
            }
        }
    }

    public void put(K key, V value)
    {
        if (counter / mapSize > LOAD_FACTOR)
        {
            resize();
        }

        int keyHash = getHash(key);

        if (data[keyHash] == null)
        {
            data[keyHash] = new ArrayList<>();
        }

        Pair pair = getPair(key, keyHash);
        if (pair == null)
            data[keyHash].add(new Pair(key, value));
        else
            pair.value = value;

        counter++;
    }

    public V get(K key)
    {
        int keyHash = getHash(key);
        Pair pair = getPair(key, keyHash);

        return pair == null ? null : (V) pair.value;
    }

    private Pair getPair(K key, int... keyHash)
    {
        if (keyHash.length == 0)
        {
            keyHash = new int[1];
            keyHash[0] = getHash(key);
        }

        List<Pair> list = data[keyHash[0]];
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

    private int getHash(K key)
    {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    public int size()
    {
        return counter;
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
                if (listIterator != null && listIterator.hasNext())
                {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null
                        && currentElement < data.length; currentElement++)
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
