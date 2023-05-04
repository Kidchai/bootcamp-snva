package multithreading;

public class ThreadGroupExample implements Runnable {
    public static void main(String[] args) {
        ThreadGroupExample runnable = new ThreadGroupExample();

        ThreadGroup group = new ThreadGroup("GroupName");
        Thread t1 = new Thread(group, runnable, "one");
        Thread t2 = new Thread(group, runnable, "two");
        Thread t3 = new Thread(group, runnable, "three");

        System.out.printf("Name of the group: %s\n", group.getName());

        System.out.printf("Number of active threads: %d\n", group.activeCount());

        t1.start();
        t2.start();
        t3.start();

        System.out.printf("Number of active threads: %d\n", group.activeCount());
    }

    @Override
    public void run() {
        System.out.printf("%s is running\n", Thread.currentThread().getName());
    }
}
