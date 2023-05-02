package exceptions.unchecked;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String number = "123";

        try {
            int result = Integer.parseInt(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("The string is not a valid number. It will cause a NumberFormatException");
        }
    }
}
