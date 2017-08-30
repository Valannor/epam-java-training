package lessons.classworks.lesson170830;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.Executor;

public class Worker implements Executor
{
    Queue<Runnable> tasks = new LinkedList<>();

    public Worker()
    {
        new Thread(this::processTasks).start();
    }

    @Override
    public void execute(Runnable command)
    {
        synchronized (tasks)
        {
            tasks.offer(command);
            tasks.notify();
        }
    }

    private void processTasks()
    {
        while (true)
        {
            Runnable task = null;
            synchronized (tasks)
            {
                while (tasks.isEmpty())
                {
                    try
                    {
                        tasks.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                task = tasks.poll();
            }
            Optional.ofNullable(task).ifPresent(r -> r.run());
        }

    }
}
