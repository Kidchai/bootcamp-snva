package exceptions.blocks;

public class FinallyBlock {
    public static void main(String[] args) {
        String line = null;

        try {
            System.out.printf("The line length is %d\n", line.length());
        } catch (NullPointerException e) {
            System.out.println("Something went wrong. We caught a NullPointerException");
            System.out.println("It's a NullPointerException");
        } finally {
            System.out.println("This is finally block. It will be executed anyway.");
        }

        System.out.println("=====================================");
        line = "This is a string";

        try {
            System.out.printf("The line length is %d\n", line.length());
            System.out.println("Everything is fine. No exceptions were thrown.");
        } catch (NullPointerException e) {
            System.out.println("It's a NullPointerException");
        } finally {
            System.out.println("This is finally block. It will be executed anyway.");
        }
    }
}
