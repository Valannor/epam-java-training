package lessons.classworks.lesson170717.musical_instruments;

import lessons.classworks.lesson170717.musical_instruments.keyboard.Piano;
import lessons.classworks.lesson170717.musical_instruments.stringed.Cello;
import lessons.classworks.lesson170717.musical_instruments.stringed.Guitar;
import lessons.classworks.lesson170717.musical_instruments.stringed.Violin;
import lessons.classworks.lesson170717.musical_instruments.wind.Flute;
import lessons.classworks.lesson170717.musical_instruments.wind.Sax;
import lessons.classworks.lesson170717.musical_instruments.wind.Trumpet;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        List<MusicalInstrument> instruments = new ArrayList<>();

        instruments.add(new Piano());
        instruments.add(new Cello());
        instruments.add(new Guitar());
        instruments.add(new Violin());
        instruments.add(new Flute());
        instruments.add(new Sax());
        instruments.add(new Trumpet());

        for (Instrument instrument : instruments)
        {
            instrument.doSomething();
        }
    }
}
