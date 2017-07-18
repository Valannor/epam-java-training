package lessons.independent_classworks.lesson170717.musical_instruments;

import lessons.independent_classworks.lesson170717.musical_instruments.keyboard.Piano;
import lessons.independent_classworks.lesson170717.musical_instruments.stringed.Cello;
import lessons.independent_classworks.lesson170717.musical_instruments.stringed.Guitar;
import lessons.independent_classworks.lesson170717.musical_instruments.stringed.Violin;
import lessons.independent_classworks.lesson170717.musical_instruments.wind.Flute;
import lessons.independent_classworks.lesson170717.musical_instruments.wind.Sax;
import lessons.independent_classworks.lesson170717.musical_instruments.wind.Trumpet;

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
