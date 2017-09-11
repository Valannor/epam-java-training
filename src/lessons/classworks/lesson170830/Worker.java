package lessons.classworks.lesson170830;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor
{
    static final Runnable POISON_PILL = () -> {};

    BlockingQueue<Runnable> tasks = new BlockingQueue<>();
    volatile private boolean stop = false;

    public Worker()
    {
        new Thread(this::processTasks).start();
    }

    @Override
    public void execute(Runnable command)
    {
        if (!stop)
        {
            tasks.put(command);
        }
    }

    private void processTasks()
    {
        while (!stop)
        {
            Runnable task = tasks.take();
            if (task == POISON_PILL)
            {
                return;
            }

            Optional.ofNullable(task).ifPresent(r -> r.run());
        }
    }

    public List<Runnable> shutdownNow()
    {
        stop = true;

        return null;
    }

    public void shutdown()
    {
        tasks.put(POISON_PILL);
//        stop = true;
    }
}
