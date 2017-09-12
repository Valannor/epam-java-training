package mytestframework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer
{
    private static boolean started = false;
    private static Date startTime;
    private static DateFormat format = new SimpleDateFormat("mm:ss.SSS");

    public static void startTimer()
    {
        System.out.println("Timer has started...");
        started = true;

        startTime = new Date();
    }

    public static String stopTimer(String testName)
    {
        String stringResult = null;

        if (started)
        {
            Date stopTime = new Date();
            Date result = new Date(stopTime.getTime() - startTime.getTime());

            stringResult = String.format("Test for %s\r\nTime passed (Minutes:Seconds.Milliseconds): %s"
                                    + "\r\n--------------------------------------------------",
                    testName, format.format(result));
//            System.out.println(stringResult);

            started = false;
        }

        return stringResult;
    }

    public static void main(String[] args) throws InterruptedException
    {
        startTimer();
        Thread.sleep(5021);
        System.out.println(stopTimer("TimerTest"));
    }
}
