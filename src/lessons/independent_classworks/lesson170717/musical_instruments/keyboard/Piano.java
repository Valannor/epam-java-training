package lessons.independent_classworks.lesson170717.musical_instruments.keyboard;

public class Piano extends KeyboardInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("piano ");
        super.makeSound();
    }
}
