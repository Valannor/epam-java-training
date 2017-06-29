package lessons.classworks.lesson170629.tests;

import lessons.classworks.lesson170629.main.DataGenerator;
import lessons.classworks.lesson170629.main.Genome;

public class GenomTest
{
    public static void main(String[] args)
    {
//        byte[] GTCA_TCAA_CAAT_AATT_ATTC
//                = {'G', 'T', 'C', 'A', 'A', 'T', 'T', 'C', 'G', 'T', 'C' , 'A', 'A', 'T', 'T', 'C'};

        byte[] data = DataGenerator.generate(3000);

        for (byte b : data)
        {
            System.out.print((char) b);
        }
        System.out.println();

        Genome.findDuplicatesInLoop(data, 5);
    }
}
