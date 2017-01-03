package chapter10.entry69;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * @author jacka
 * @version 1.0 on 1/2/2017.
 */
public class ConcurrentTimerExample {
  private ConcurrentTimerExample() {
  } // Noninstantiable

  public static long time(Executor executor, int concurrency,
                          final Runnable action) throws InterruptedException {
    final CountDownLatch ready = new CountDownLatch(concurrency);
    final CountDownLatch start = new CountDownLatch(1);
    final CountDownLatch done = new CountDownLatch(concurrency);

    for (int i = 0; i < concurrency; i++) {
      executor.execute(new Runnable() {
        public void run() {
          ready.countDown(); // Tell timer we're ready
          try {
            start.await(); // Wait till peers are ready
            action.run();
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          } finally {
            done.countDown(); // Tell timer we're done
          }
        }
      });
    }

    ready.await(); // Wait for all workers to be ready
    long startNanos = System.nanoTime();
    start.countDown(); // And they're off!
    done.await(); // Wait for all workers to finish
    return System.nanoTime() - startNanos;
  }
}
