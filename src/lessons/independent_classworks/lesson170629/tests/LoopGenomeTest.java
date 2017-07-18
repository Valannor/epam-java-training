package lessons.independent_classworks.lesson170629.tests;

import lessons.independent_classworks.lesson170629.main.DataGenerator;
import lessons.independent_classworks.lesson170629.main.Genome;

public class LoopGenomeTest
{
    public static void main(String[] args)
    {
        byte[] data = DataGenerator.generate();

        Genome.findDuplicatesInLoop(data, DataGenerator.getWordSize());
    }
}
