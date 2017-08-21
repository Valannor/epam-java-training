package lessons.classworks.lesson170821;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdaPredicate
{
    public static void main(String[] args)
    {
        Predicate<String> predicate1 = s -> s.isEmpty();

        Predicate<String> predicate2 = String::isEmpty;

        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("Hello!"));

        BiPredicate<String, String> biPredicate1 = (str, pre) -> str.startsWith(pre);
        BiPredicate<String, String> biPredicate2 = String::startsWith;
    }
}
