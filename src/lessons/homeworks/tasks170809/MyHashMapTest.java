package lessons.homeworks.tasks170809;

public class MyHashMapTest
{
    public static void main(String[] args)
    {
        MyHashMap<String, String> d = new MyHashMap<>();

        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");
        d.put("Петя", "Москва");
        d.put("Боря", "Москва");
        d.put("Оля", "Москва");
        d.put("Жанна", "Москва");
        d.put("Маша", "Москва");
        d.put("Вано", "Москва");

        System.out.println(d.get("Ann"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Вася"));

        d.put("Вася", "Петербург");
        System.out.println(d.get("Вася"));

        for (MyHashMap.Pair pair : d)
        {
            System.out.println(pair.key + " : " + pair.value);
        }


        System.out.println("\r\nRemove implementation test: John removed. He lives in " + d.remove("John"));

        for (MyHashMap.Pair pair : d)
        {
            System.out.println(pair.key + " : " + pair.value);
        }
    }
}
