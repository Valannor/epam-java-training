package lessons.classworks.lesson170717.stringed;

public class Violin extends StringedInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("violin ");
        super.makeSound();
    }
}
