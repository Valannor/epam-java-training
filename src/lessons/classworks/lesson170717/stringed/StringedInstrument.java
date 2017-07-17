package lessons.classworks.lesson170717.stringed;

import lessons.classworks.lesson170717.MusicalInstrument;

public abstract class StringedInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}
