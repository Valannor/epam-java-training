package lessons.homeworks.tasks170701.genome.tests;

import lessons.homeworks.tasks170701.genome.main.DataGenerator;
import lessons.homeworks.tasks170701.genome.main.Genome;

public class HashGenomeTest
{
    public static void main(String[] args)
    {
        byte[] data = DataGenerator.generate();

        Genome.findDuplicatesByHashCode(data, DataGenerator.getWordSize());
    }
}
