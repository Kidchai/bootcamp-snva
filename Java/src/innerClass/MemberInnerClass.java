package innerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();
    }
}

class OuterClass {
    private int number = 10;

    class InnerClass {
        public void print() {
            System.out.printf("The number is %d\n,", number);
        }
    }
}
