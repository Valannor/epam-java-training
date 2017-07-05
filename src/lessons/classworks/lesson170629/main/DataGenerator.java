package lessons.classworks.lesson170629.main;

import java.util.Random;

public class DataGenerator
{
    private static final byte[] ALPHABET = {'A', 'C', 'G', 'T'};

    private static int GenomeSize = 3000;
    private static int WordSize = 3;

    public static byte[] generate()
    {
        int size = getGenomeSize();

        byte[] data = new byte[size];

        Random random = new Random();

        for (int i = 0; i < data.length; i++)
        {
            data[i] = ALPHABET[random.nextInt(ALPHABET.length)];
        }

        return data;
    }

    public static int getGenomeSize()
    {
        return GenomeSize;
    }

    public static void setGenomeSize(int size)
    {
        GenomeSize = size;
    }

    public static int getWordSize()
    {
        return WordSize;
    }

    public static void setWordSize(int wordSize)
    {
        WordSize = wordSize;
    }
}
