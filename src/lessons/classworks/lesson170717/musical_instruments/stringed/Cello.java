package lessons.classworks.lesson170717.musical_instruments.stringed;

public class Cello extends StringedInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("cello ");
        super.makeSound();
    }
}
