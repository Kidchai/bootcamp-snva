package innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        TestOuter.TestInner testInner = new TestOuter.TestInner();
        testInner.showData();
    }

    class TestOuter {
        static int number = 10;
        static class TestInner {
            void showData() {
                System.out.printf("It's a static inner class. The number is %d\n", number);
            }
        }
    }
}
