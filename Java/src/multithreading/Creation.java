package multithreading;

public class Creation {
    public static void main(String[] args) {
        int numberOfThreads = 8;

        //Run threads extended from Thread class
        for (int i = 0; i < numberOfThreads; i++) {
            WithThreadClass thread = new WithThreadClass();
            thread.start();
        }

        //Run threads implemented from Runnable interface
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new WithRunnableInterface());
            thread.start();
        }
    }
}

class WithThreadClass extends Thread {
    public void run() {
        try {
            long id = Thread.currentThread().getId();
            System.out.printf("Thread extended from Thread class №%d is running\n", id);
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class WithRunnableInterface implements Runnable {
    public void run() {
        try {
            long id = Thread.currentThread().getId();
            System.out.printf("Thread implemented from Runnable interface №%d is running\n", id);
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

