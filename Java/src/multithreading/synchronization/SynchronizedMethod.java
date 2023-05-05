package multithreading.synchronization;

public class SynchronizedMethod {
    public static void main(String[] args) {
        Counter1 counter = new Counter1(); // shared object => race condition

        ThreadCounter1 thread1 = new ThreadCounter1(counter);
        ThreadCounter1 thread2 = new ThreadCounter1(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // wait for thread to terminate
            thread2.join();
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }

        System.out.println(counter.getCount()); //result is not 20000
    }
}

class Counter1 {
    private int count;

    //now only one thread can execute this method at a time (implicit lock on 'this' object)
    public synchronized void increment() {
        count++; //not atomic operation
    }
    public int getCount() {
        return count;
    }
}

class ThreadCounter1 extends Thread {
    Counter1 counter;

    public ThreadCounter1(Counter1 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}
