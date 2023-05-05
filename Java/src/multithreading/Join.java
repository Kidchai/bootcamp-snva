package multithreading;

/*
When we invoke the join() method on a thread, the calling thread goes into a waiting state.
It remains in a waiting state until the referenced thread terminates.
 */
public class Join {
    public static void main(String[] args) {
        ThreadJoin thread1 = new ThreadJoin();
        ThreadJoin thread2 = new ThreadJoin();
        thread1.start();
        try {
            thread1.join(); // wait for thread1 to terminate
        }
        catch (InterruptedException e) {
            System.out.println("Exception is caught");
        }
        thread2.start();
    }
}

class ThreadJoin extends Thread {
    public void run() {
        try {
            long id = Thread.currentThread().getId();
            System.out.printf("Thread №%d is running\n", id);
            Thread.sleep(1000 * 2); // sleep for 2 seconds
            System.out.printf("Thread №%d is completed\n", id);
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
