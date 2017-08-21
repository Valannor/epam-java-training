package lessons.classworks.lesson170821;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LambdaConsumer
{
    public static void main(String[] args)
    {
        /**
         * Single arg Consumer examples
         */
        Consumer<String> consumer1 = new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };

        Consumer<String> consumer2 = (s) -> System.out.println(s);

        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Hello!");


        /**
         * BiConsumer examples
         */
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer1 = new BiConsumer<String, Integer>()
        {
            @Override
            public void accept(String key, Integer value)
            {
                map.put(key, value);
            }
        };

        BiConsumer<String, Integer> biConsumer2 = (key, value) -> map.put(key, value);

        BiConsumer<String, Integer> biConsumer3 = map::put;
        biConsumer3.accept("Hello!", 3);
    }
}
