package lessons.classworks.lesson170717.wind;

public class Trumpet extends WindInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("trumpet ");
        super.makeSound();
    }
}
