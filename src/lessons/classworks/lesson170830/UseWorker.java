package lessons.classworks.lesson170830;

public class UseWorker
{
    public static void main(String[] args)
    {
        Worker worker = new Worker();

        worker.execute(() -> {
            System.out.println("hello, ");
        });

        worker.execute(() -> {
            System.out.println("world!");
        });

//        worker.shutdownNow();
        worker.shutdown();
    }
}
