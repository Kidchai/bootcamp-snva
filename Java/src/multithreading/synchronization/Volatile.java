package multithreading.synchronization;

/*
volatile has semantics for memory visibility. Basically, the value of a volatile field becomes visible to all readers
(other threads in particular) after a write operation completes on it.
Without volatile, readers could see some non-updated value.
 */

public class Volatile {
}

class ThreadVolatile extends Thread {
    private volatile static int number;
    private volatile static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new Reader().start();
        number = 42;
        ready = true;
    }
}
