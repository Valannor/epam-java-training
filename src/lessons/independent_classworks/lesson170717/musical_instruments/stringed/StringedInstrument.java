package lessons.independent_classworks.lesson170717.musical_instruments.stringed;

import lessons.independent_classworks.lesson170717.musical_instruments.MusicalInstrument;

public abstract class StringedInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
