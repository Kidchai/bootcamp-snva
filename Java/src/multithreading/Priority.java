package multithreading;

public class Priority {
    public static void main(String[] args) {
        ThreadPriority thread1 = new ThreadPriority();
        ThreadPriority thread2 = new ThreadPriority();
        ThreadPriority thread3 = new ThreadPriority(); // default priority is 5 or NORM_PRIORITY

        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.MAX_PRIORITY); // 10

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class ThreadPriority extends Thread {
    public void run() {
        try {
            System.out.printf("%s with priority %d is running\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
