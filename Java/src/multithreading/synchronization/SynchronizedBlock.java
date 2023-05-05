package multithreading.synchronization;

public class SynchronizedBlock {
    public static void main(String[] args) {
        Counter2 counter = new Counter2(); // shared object => race condition

        ThreadCounter2 thread1 = new ThreadCounter2(counter);
        ThreadCounter2 thread2 = new ThreadCounter2(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // wait for thread to terminate
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exception is caught");
        }

        System.out.println(counter.getCount()); //result is not 20000
    }
}

class Counter2 {
    private int count;

    //now only one thread can execute this method at a time
    public void increment() {
        synchronized (this) { //we need to write what object we want to lock
            count++; //not atomic operation
        }
    }
    public int getCount() {
        return count;
    }
}

class ThreadCounter2 extends Thread {
    Counter2 counter;

    public ThreadCounter2(Counter2 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}