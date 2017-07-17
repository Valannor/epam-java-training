package lessons.classworks.lesson170717.keyboard;

public class Piano extends KeyboardInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("piano ");
        super.makeSound();
    }
}
