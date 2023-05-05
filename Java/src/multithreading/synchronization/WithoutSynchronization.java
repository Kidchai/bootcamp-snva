package multithreading.synchronization;

public class WithoutSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter(); // shared object => race condition

        ThreadCounter thread1 = new ThreadCounter(counter);
        ThreadCounter thread2 = new ThreadCounter(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // wait for thread to terminate
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exception is caught");
        }

        System.out.println(counter.getCount()); //result is not 20000 (at least not always)
    }
}

class Counter {
    private int count;
    public void increment() {
        count++; //not atomic operation
    }
    public int getCount() {
        return count;
    }
}

class ThreadCounter extends Thread {
    Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}
