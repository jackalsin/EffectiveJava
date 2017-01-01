package chapter10.entry66;

import java.util.concurrent.TimeUnit;

/**
 * <p>The purpose is to after call {@code backgroundThread.start()} one second, expecting it modify
 * the stopRequested, then stop the background start.
 *
 * <p>However, it will never stop</p>
 * @author jacka
 * @version 1.0 on 1/1/2017.
 */
public class SynchronizationThread {
  private static boolean stopRequested;
  public static void main(String[] args)
      throws InterruptedException {
    Thread backgroundThread = new Thread(new Runnable() {
      public void run() {
        int i = 0;
        while (!stopRequested)
          i++;
      }
    });
    backgroundThread.start();
    TimeUnit.SECONDS.sleep(1);
    stopRequested = true;
  }
}
