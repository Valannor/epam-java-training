package lessons.classworks.lesson170629.tests;

import lessons.classworks.lesson170629.main.DataGenerator;
import lessons.classworks.lesson170629.main.Genome;

public class AllTests
{
    public static void main(String[] args)
    {
        byte[] data = DataGenerator.generate();

        System.out.println("LOOP");
        Genome.findDuplicatesInLoop(data, DataGenerator.getWordSize());

        System.out.println("\r\nSORT");
        Genome.findDuplicatesWithSort(data, DataGenerator.getWordSize());
    }
}
