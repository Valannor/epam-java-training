package lessons.classworks.lesson170717.musical_instruments.wind;

import lessons.classworks.lesson170717.musical_instruments.MusicalInstrument;

public abstract class WindInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
