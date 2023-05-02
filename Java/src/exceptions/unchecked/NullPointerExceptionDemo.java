package exceptions.unchecked;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String line = null;

        try {
            System.out.println(line.length());
        } catch (NullPointerException e) {
            System.out.println("The line is null. We can't invoke length() method. It will cause a NullPointerException");
        }
    }
}
