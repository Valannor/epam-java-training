package lessons.classworks.lesson170717.musical_instruments.stringed;

import lessons.classworks.lesson170717.musical_instruments.MusicalInstrument;

public abstract class StringedInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
