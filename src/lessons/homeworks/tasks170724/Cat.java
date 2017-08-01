package lessons.homeworks.tasks170724;

public class Cat implements Pet
{
    private Brain brain = new Hungry();

    private interface CatBrain extends Brain
    {
    }

    private class Fed implements CatBrain
    {
        @Override
        public void feed()
        {
            beThankful();
        }

        @Override
        public void play()
        {
            meow();
            beReady();
            brain = new Hungry();
        }

        @Override
        public void wash()
        {
            getCrazy();
            beRude();
        }
    }

    private class Hungry implements CatBrain
    {
        @Override
        public void feed()
        {
            beThankful();
            brain = new Fed();
        }

        @Override
        public void play()
        {
            getCrazy();
            sleep();
        }

        @Override
        public void wash()
        {
            getCrazy();
            beRude();
        }
    }

    @Override
    public void feed()
    {
        brain.feed();
    }

    @Override
    public void play()
    {
        brain.play();
    }

    @Override
    public void wash()
    {
        brain.wash();
    }


    private void beRude()
    {
        System.out.println("Bite off the leg");
    }

    private void beThankful()
    {
        System.out.println("Bring castle, princess and gold");
    }

    private void beReady()
    {
        System.out.println("Put on boots");
    }

    private void meow()
    {
        System.out.println("Meow-meow");
    }

    private void getCrazy()
    {
        System.out.println("Woof-woof");
    }

    private void sleep()
    {
        System.out.println("Zzzzzzz");
    }
}
