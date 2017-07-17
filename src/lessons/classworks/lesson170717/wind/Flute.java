package lessons.classworks.lesson170717.wind;

public class Flute extends WindInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("flute ");
        super.makeSound();
    }
}
