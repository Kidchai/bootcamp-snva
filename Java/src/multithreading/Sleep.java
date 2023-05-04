package multithreading;

public class Sleep {
    public static void main(String[] args) {
        ThreadSleep thread1 = new ThreadSleep();
        ThreadSleep thread2 = new ThreadSleep();
        thread1.start();
        thread2.start();

    }
}

class ThreadSleep extends Thread {
    public void run() {
        try {
            long id = Thread.currentThread().getId();
            System.out.printf("Thread №%d is running\n", id);
            Thread.sleep(1000 * 3); // sleep for 3 seconds
            System.out.printf("Thread №%d is completed\n", id);
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
