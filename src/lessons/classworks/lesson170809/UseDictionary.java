package lessons.classworks.lesson170809;

public class UseDictionary
{
    public static void main(String[] args)
    {
        Dictionary dictionary = new Dictionary();

        dictionary.put("Pete", "New York");
        dictionary.put("John", "Boston");
        dictionary.put("Вася", "Москва");

//        System.out.println(dictionary.get("Ann"));
//        System.out.println(dictionary.get("John"));
//        System.out.println(dictionary.get("Вася"));

        dictionary.put("Вася", "Петербург");
//        System.out.println(dictionary.get("Вася"));

        for (Dictionary.Pair pair : dictionary)
        {
            System.out.println(pair.value);
        }
    }
}
