package mytestframework;

import java.time.Duration;
import java.time.Instant;

public class ModernTimer
{
    private static boolean isStarted = false;
    private static Instant startTimer;
    private static String test;

    public static void start(String testName)
    {
        System.out.format("Timer for %s started...\r\n", testName);
        test = testName;

        isStarted = true;

        startTimer = Instant.now();
    }

    public static void stop()
    {
        if (isStarted)
        {
            Instant stopTimer = Instant.now();
            Duration elapsed = Duration.between(startTimer, stopTimer);

            long minutes = elapsed.toMinutes();
            long seconds = elapsed.getSeconds();
            long millis = elapsed.toMillis()
                    - (minutes * 60_000)
                    - (seconds * 1000);

            System.out.format("%s - passed (min:sec:mil): %d:%d:%d",
                    test, minutes, seconds, millis);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
//        Instant start = Instant.now();
//        Thread.sleep(1000);
//        Instant stop = Instant.now();
//        Duration elapsed = Duration.between(start, stop);
//
//        System.out.println(elapsed.getSeconds());
//        System.out.println(elapsed.getNano());

        start("ModernTimer");

        Thread.sleep(5021);

        stop();
    }
}
