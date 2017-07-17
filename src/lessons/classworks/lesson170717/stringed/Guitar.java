package lessons.classworks.lesson170717.stringed;

public class Guitar extends StringedInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("guitar ");
        super.makeSound();
    }
}
