package lessons.classworks.lesson170825.traders_exercises;

import java.util.*;
import java.util.stream.Collectors;

public class UseTrader
{
	/*
     *
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 *
	 * 2 What are all the unique cities where the traders work?
	 *
	 * 3 Find all traders from Cambridge and sort them by name.
	 *
	 * 4 Return a string of all traders’ names sorted alphabetically.
	 *
	 * 5 Are any traders based in Milan?
	 *
	 * 6 Print all transactions’ values from the traders living in Cambridge.
	 *
	 * 7 What’s the highest value of all the transactions?
	 *
	 * 8 Find the transaction with the smallest value.
	 */

    public static void main(String[] args)
    {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        //1
        System.out.println("- 1 -");
        List<Transaction> year2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
        year2011.sort(Comparator.comparing(Transaction::getValue));
        System.out.println(year2011);

        // 2
        System.out.println("\r\n- 2 -");
        List<String> cities = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity).distinct()
                .collect(Collectors.toList());
        System.out.println(cities);

        // 3
        System.out.println("\r\n- 3 -");
        List<Trader> traders = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct().collect(Collectors.toList());
        traders.sort(Comparator.comparing(Trader::getName));
        System.out.println(traders);

        // 4
        System.out.println("\r\n- 4 -");
        String allNamesSorted = transactions.stream().map(Transaction::getTrader).map(Trader::getName)
                .sorted().distinct().collect(Collectors.joining(" "));
        System.out.println(allNamesSorted);

        // 5
        System.out.println("\r\n- 5 -");
        boolean inMilan = transactions.stream().map(Transaction::getTrader)
                .distinct().anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(inMilan);

        // 6
        System.out.println("\r\n- 6 -");
        List<Integer> valuesInCambridge = transactions.stream().filter(trader -> trader.getTrader().getCity()
                .equals("Cambridge")).map(Transaction::getValue)
                /*.peek(System.out::println)*/.collect(Collectors.toList());
        System.out.println(valuesInCambridge);

        // 7
        System.out.println("\r\n- 7 -");
        Optional<Integer> max = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue)).map(Transaction::getValue);
        max.ifPresent(System.out::println);

        // 8
        System.out.println("\r\n- 8 -");
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        min.ifPresent(System.out::println);
    }
}
