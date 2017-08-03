package lessons.homeworks.tasks170724;


public class MouseHelper
{
    private Mouse mouse;

    public MouseHelper(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public void feed()
    {
        mouse.feed();
    }

    public void play()
    {
        mouse.play();
    }

    public void wash()
    {
        mouse.wash();
    }
}

class Mouse
{
    private boolean hungry = true;

    public void feed()
    {
        eat();
        runAway();
        hungry = false;
    }

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