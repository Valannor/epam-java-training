package lessons.classworks.lesson170629.tests;

import lessons.classworks.lesson170629.main.DataGenerator;
import lessons.classworks.lesson170629.main.Genome;

public class HashGenomeTest
{
    public static void main(String[] args)
    {
        byte[] data = DataGenerator.generate();

        Genome.findDuplicatesByHashCode(data, DataGenerator.getWordSize());
    }
}
