package multithreading;

/*
Thread Pool pattern helps to save resources in a multithreaded application and to contain the parallelism
in certain predefined limits.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable {
    public static void main(String[] args) {
        ThreadPoolExample thread1 = new ThreadPoolExample();
        ThreadPoolExample thread2 = new ThreadPoolExample();
        ThreadPoolExample thread3 = new ThreadPoolExample();
        ThreadPoolExample thread4 = new ThreadPoolExample();

        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 threads in the pool

        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.execute(thread4);

        pool.shutdown();
    }

    public void run() {
        try {
            String name = Thread.currentThread().getName();
            System.out.printf("%s is running\n", name);
            Thread.sleep(1000 * 2);
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Stage %d for %s\n", i, name);
            }

        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
