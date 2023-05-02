package innerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printInfo();
    }
}

class Outer {
    void printInfo() {
        String message = "Hello!";
        class LocalInner {
            void printInfoFromLocalInner() {
                System.out.printf("%s This is a local inner class\n", message);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.printInfoFromLocalInner();
    }
}
