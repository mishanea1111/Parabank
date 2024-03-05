package util;

import java.util.concurrent.TimeUnit;

public class WaitUtils {
    public static long DEFAULT_RETRY_INTERVAL_MS=2000;
    public static void waitForRetry(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static <z> Boolean waitUnitCondition (boolean condition, int timeout) {
        boolean result =!condition;
        long timeOutInMillis = TimeUnit.SECONDS.toMillis(timeout);
        long start = System.currentTimeMillis();

        while ((System.currentTimeMillis()-start)< timeOutInMillis) {
            waitForRetry(DEFAULT_RETRY_INTERVAL_MS);
        }
        return result;
    }
}
