package lessons.classworks.lesson170717.wind;

import lessons.classworks.lesson170717.MusicalInstrument;

public abstract class WindInstrument extends MusicalInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.println("sound");
    }
}