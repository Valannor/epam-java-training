package lessons.classworks.lesson170825;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        // 5
        boolean inMilan = transactions.stream().map(Transaction::getTrader)
                .distinct().anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(inMilan);

        // 6
        List<Integer> valuesInCambridge = transactions.stream().filter(trader -> trader.getTrader().getCity()
                .equals("Cambridge")).map(Transaction::getValue)
                /*.peek(System.out::println)*/.collect(Collectors.toList());
        System.out.println(valuesInCambridge);

        // 7
//        Optional<Integer> max = transactions.stream().

        // 8
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        min.ifPresent(System.out::println);
    }
}
