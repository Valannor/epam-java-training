package lessons.classworks.lesson170825;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreamExamples
{
    public static void main(String[] args)
    {
        IntStream intStream = IntStream.rangeClosed(1, 10);

//        int sum = IntStream.rangeClosed(1, 10).sum();
//        long count = IntStream.rangeClosed(1, 10).count();

        printStats(intStream);
    }

    private static void printStats(IntStream intStream)
    {
        // Here we can peek specific info
        IntSummaryStatistics summaryStatistics = intStream.summaryStatistics();
        System.out.println(summaryStatistics);
    }
}
