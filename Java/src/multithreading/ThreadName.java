package multithreading;

public class ThreadName {
    public static void main(String[] args) {
        TestThreadName thread1 = new TestThreadName();

        System.out.printf("Name of thread1: %s\n", thread1.getName());
        thread1.setName("Anatoly");
        System.out.printf("Name of thread1: %s\n", thread1.getName());

        ConstructorThreadName thread2 = new ConstructorThreadName("Leonid");
        System.out.printf("Name of thread2: %s\n", thread2.getName());
    }
}

class TestThreadName extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

class ConstructorThreadName extends Thread {
    ConstructorThreadName(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Running");
    }
}
