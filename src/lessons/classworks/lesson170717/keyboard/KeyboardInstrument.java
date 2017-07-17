package lessons.classworks.lesson170717.keyboard;

import lessons.classworks.lesson170717.MusicalInstrument;

public abstract class KeyboardInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
