package lessons.independent_classworks.lesson170629.tests;

import lessons.independent_classworks.lesson170629.main.DataGenerator;
import lessons.independent_classworks.lesson170629.main.Genome;
import mytestframework.Timer;

import java.util.ArrayList;
import java.util.List;

public class AllTests
{
    public static void main(String[] args)
    {
        DataGenerator.setGenomeSize(3000);
        byte[] data_1 = DataGenerator.generate();
        int value_1 = data_1.length;
        List<String> timeTestResults_1 = new ArrayList<>();
        testMethod(data_1, value_1, timeTestResults_1);

        DataGenerator.setGenomeSize(3000000);
        byte[] data_2 = DataGenerator.generate();
        int value_2 = data_2.length;
        List<String> timeTestResults_2 = new ArrayList<>();
        testMethod(data_2, value_2, timeTestResults_2);

        printResults(value_1, timeTestResults_1);
        printResults(value_2, timeTestResults_2);

        /*
         * Conclusion - if we need to work with small amount of information, it's better to use "HASH" method.
         * Otherwise, "SORT" method works faster.
         */
    }

    private static void testMethod(byte[] data, int value, List<String> timeTestResults)
    {
        String testLoop = "LOOP (" + value + ")";
        System.out.println(testLoop);
        Timer.startTimer();
        Genome.findDuplicatesInLoop(data, DataGenerator.getWordSize());
        timeTestResults.add(Timer.stopTimer(testLoop));

        String testSort = "SORT (" + value + ")";
        System.out.println("\r\n" + testSort);
        Timer.startTimer();
        Genome.findDuplicatesWithSort(data, DataGenerator.getWordSize());
        timeTestResults.add(Timer.stopTimer(testSort));

        String testHash = "HASH (" + value + ")";
        System.out.println("\r\n" + testHash);
        Timer.startTimer();
        Genome.findDuplicatesByHashCode(data, DataGenerator.getWordSize());
        timeTestResults.add(Timer.stopTimer(testHash));

//        printResults(value, timeTestResults);
    }

    private static void printResults(int value, List<String> timeTestResults)
    {
        System.out.format("\r\n\r\nTIME TEST RESULTS (%d):\r\n", value);
        for (String print : timeTestResults)
        {
            System.out.println(print);
        }
    }
}
