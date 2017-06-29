package lessons.classworks.lesson170629.main;

import java.util.Random;

public class DataGenerator
{
    private static final byte[] ALPHABET = {'A', 'C', 'G', 'T'};

    public static byte[] generate(int size)
    {
        byte[] data = new byte[size];

        Random random = new Random();

        for (int i = 0; i < data.length; i++)
        {
            data[i] = ALPHABET[random.nextInt(ALPHABET.length)];
        }

        return data;
    }
}
