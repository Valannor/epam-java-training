package lessons.classworks.lesson170629.main;

import java.util.*;

public class Genome
{
    public static class GenomeWord implements Comparable
    {
        byte[] data;
        int offset = -1;
        int wordSize = -1;

        public GenomeWord(byte[] data, int offset, int wordSize)
        {
            this.data = data;
            this.offset = offset;
            this.wordSize = wordSize;
        }

        public GenomeWord(byte[] data)
        {
            this.data = data;
        }

        public int getOffset()
        {
            return offset;
        }

        @Override
        public int compareTo(Object another)
        {
            GenomeWord anotherWord = (GenomeWord) another;

            for (int i = 0; i < wordSize; i++)
            {
                int result = this.data[i + this.offset] - anotherWord.data[i + anotherWord.offset];

                if (result != 0)
                {
                    return result;
                }
            }

            return 0;
        }

        @Override
        public String toString()
        {
            byte[] word;

            if (offset != -1)
            {
                word = Arrays.copyOfRange(data, offset, offset + wordSize);
            }
            else
            {
                word = data;
            }

            return new String(word);
        }

        @Override
        public int hashCode()
        {
            return this.toString().hashCode();
        }

        @Override
        public boolean equals(Object obj)
        {
            return (this == obj)
                    || ((obj instanceof GenomeWord)
                    && (this.toString().equals(obj.toString())));
        }
    }

    public static void findDuplicatesInLoop(byte[] data, int wordSize)
    {
        System.out.println("Found : \r\n");

        Set<String> words = new HashSet<>();
        int allDuplicatesCounter = 0;
        NEXTLOOP:
        for (int i = 0; i < data.length; i += wordSize)
        {
            int counter = 1;
            byte[] wordData = new byte[wordSize];

            NoMatch:
            for (int j = i + wordSize; j < data.length - wordSize + 1; j += wordSize)
            {
                for (int k = 0; k < wordSize; k++)
                {
                    wordData[k] = data[i + k];
                    if (data[i + k] != data[j + k])
                    {
                        continue NoMatch;
                    }
                }

                if (words.contains(new String(wordData)))
                    continue NEXTLOOP;

                counter++;
            }

            words.add(new String(wordData));

            if (counter >= 2)
            {
                GenomeWord word = new GenomeWord(wordData);
                if (word.toString().length() == wordSize)
                {
                    System.out.println(word + " | " + counter + " entries");
                    allDuplicatesCounter += counter;
                }
            }
        }

        System.out.println("\r\nDuplicates found: " + allDuplicatesCounter);
    }

    public static void findDuplicatesWithSort(byte[] data, int wordSize)
    {
        List<GenomeWord> genomeWords = new ArrayList<>();
        for (int i = 0; i < data.length; i += wordSize)
        {
            genomeWords.add(new GenomeWord(data, i, wordSize));
        }

        Collections.sort(genomeWords);

        System.out.println("Found : \r\n");
        int allDuplicatesCounter = 0;
        for (int i = 0; i < genomeWords.size(); i++)
        {
            int counter = 1;
            GenomeWord word_1 = genomeWords.get(i);
            for (int j = i + 1; j < genomeWords.size(); j++)
            {
                GenomeWord word_2 = genomeWords.get(j);
                if (word_1.equals(word_2))
                {
                    counter++;
                }
                else break;

                i = j - 1;
            }
            if (counter >= 2)
            {
                allDuplicatesCounter += counter;
                System.out.println(word_1 + " | " + counter + " entries");
            }
        }

        System.out.println("\r\nDuplicates found: " + allDuplicatesCounter);
    }

    public static void findDuplicatesByHashCode(byte[] data, int wordSize)
    {
        List<GenomeWord> genomeWords = new ArrayList<>();
        for (int i = 0; i < data.length; i += wordSize)
        {
            genomeWords.add(new GenomeWord(data, i, wordSize));
        }

        int counter;
        Map<GenomeWord, Integer> duplicates = new HashMap<>();
        for (GenomeWord word : genomeWords)
        {
            if (duplicates.containsKey(word))
            {
                counter = duplicates.get(word) + 1;
            } else
            {
                counter = 1;
            }

            duplicates.put(word, counter);
        }

        System.out.println("Found : \r\n");
        int allDuplicatesCounter = 0;
        for (Map.Entry<GenomeWord, Integer> pair : duplicates.entrySet())
        {
            GenomeWord key = pair.getKey();
            int value = pair.getValue();

            if (value >= 2)
            {
                allDuplicatesCounter += value;

                System.out.println(key + " | " + value + " entries");
            }
        }

        System.out.println("\r\nDuplicates found: " + allDuplicatesCounter);
    }
}
