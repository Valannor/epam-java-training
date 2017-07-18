package lessons.classworks.lesson170717.musical_instruments.stringed;

public class Violin extends StringedInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("violin ");
        super.makeSound();
    }
}
