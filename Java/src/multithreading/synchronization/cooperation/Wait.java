package multithreading.synchronization.cooperation;

public class Wait {
    public static void main (String[] args) {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(wn::produce);
        Thread thread2 = new Thread(wn::consume);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception is caught");
        }
    }
}

class WaitAndNotify {
    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread started");
            try {
                //1. wait() releases intrinsic lock
                //2. and waiting for invoking notify()
                wait();

                System.out.println("Producer thread resumed");
            } catch (InterruptedException e) {
                System.out.println("Exception is caught");
            }
        }
    }

    public void consume() {
        System.out.println("Consumer thread running");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            System.out.println("Exception is caught");
        }

        synchronized (this) {
            notify(); //for one threads with wait() on this intrinsic lock
            //or
            notifyAll(); //for all threads with wait() on this intrinsic lock
            System.out.println("notify() is invoked");
            System.out.println("Wait 4 seconds until Consumer thread is finished");

            //but only notify() invoke is not enough for waking up another thread
            //for this current thread should also return intrinsic lock
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                System.out.println("Exception is caught");
            }
        }

    }
}
