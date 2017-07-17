package lessons.classworks.lesson170717.wind;

public class Sax extends WindInstrument
{
    @Override
    protected void makeSound()
    {
        System.out.print("sax ");
        super.makeSound();
    }
}
