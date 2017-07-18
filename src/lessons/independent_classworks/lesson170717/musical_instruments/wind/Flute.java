package lessons.independent_classworks.lesson170717.musical_instruments.wind;

public class Flute extends WindInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("flute ");
        super.makeSound();
    }
}
