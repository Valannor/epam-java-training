package lessons.classworks.lesson170717.musical_instruments;

public abstract class MusicalInstrument extends Instrument
{
    @Override
    protected void doSomething()
    {
        makeSound();
    }

    protected abstract void makeSound();
}
