package exceptions.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        divide(a, b);
    }

    private static void divide(int a, int b) {
        try {
            int c = a / b; // ArithmeticException
            System.out.printf("The result of division is %d%n", c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. It will cause an ArithmeticException");
        }
    }
}
