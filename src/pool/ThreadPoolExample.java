package pool;

import javascheduling.PrintThread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

    // a simple thread pool example - create 10 threads PrintThread1
    // with a pool size of 3 threads

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintThread1 thread = new PrintThread1("" + i);
            pool.execute(thread);
        }

        // shutdown the pool means no new tasks will be accepted
        // it will not wait for tasks to finish!
        pool.shutdown();

        // how can we wait for all tasks to finish?
        // we can use awaitTermination() to wait for a specific time
        // or use some counter (latch) to wait for all tasks to finish
        // see https://www.baeldung.com/java-executor-wait-for-threads

        // here is the awaitTermination() example
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
            }
        } catch (InterruptedException ex) { // if the current thread is interrupted!
            // we can use shutdownNow() to stop all tasks immediately
            pool.shutdownNow();
            // we can set the interrupt flag again
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks done\n");
    }
}
