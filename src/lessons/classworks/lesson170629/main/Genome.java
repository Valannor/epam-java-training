package lessons.classworks.lesson170629.main;

public class Genome
{
    public static void findDuplicatesInLoop(byte[] data, int w)
    {
        int counter = 0;

        for (int i = 0; i < data.length - w; i++)
        {
            NoMatch:
            for (int j = i + 1; j < data.length - w + 1; j++)
            {
                StringBuilder text = new StringBuilder();

                for (int k = 0; k < w; k++)
                {
                    if (data[i + k] != data[j + k])
                    {
                        continue NoMatch;
                    }

                    text.append((char) data[i + k]);
                }

                System.out.println("\r\n Found: " + text);
                System.out.println("i: " + i + " || j: " + j);

                counter++;
            }
        }

        System.out.println("\r\n" + counter);
    }
}
