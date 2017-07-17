package lessons.classworks.lesson170717.stringed;

public class Cello extends StringedInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("cello ");
        super.makeSound();
    }
}
