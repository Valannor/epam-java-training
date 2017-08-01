package lessons.homeworks.tasks170724;


public class MouseHelper implements Mouse.MouseBrain
{
    private Mouse mouse;

    public MouseHelper(Mouse mouse)
    {
        this.mouse = mouse;
    }

    @Override
    public void feed()
    {
        mouse.feed();
    }

    @Override
    public void play()
    {
        mouse.play();
    }

    @Override
    public void wash()
    {
        mouse.wash();
    }
}

class Mouse implements Pet
{
    private boolean hungry = true;

    interface MouseBrain extends Brain
    {
    }

    @Override
    public void feed()
    {
        eat();
        runAway();
        hungry = false;
    }

    @Override
    public void play()
    {
        if (hungry)
        {
            bite();
        }
        else
        {
            runAway();
            hungry = true;
        }
    }

    @Override
    public void wash()
    {
        bite();
    }


    private void bite()
    {
        System.out.println("Don't touch me! Chaw...");
    }

    private void runAway()
    {
        System.out.println("Tom, Spike, help me! Anybody...");
    }

    private void eat()
    {
        System.out.println("Magnificamente! Gracie!");
    }
}