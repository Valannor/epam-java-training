package lessons.classworks.lesson170717.musical_instruments.keyboard;

import lessons.classworks.lesson170717.musical_instruments.MusicalInstrument;

public abstract class KeyboardInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
