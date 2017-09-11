package lessons.homeworks.tasks170823;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class WordCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String wordsSeparatedBySpaces = scanner.nextLine();

        String[] strings = wordsSeparatedBySpaces.split(" ");
        List<String> list =  Arrays.asList(strings);

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), counting()));

        for (Map.Entry<String, Long> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
