package exceptions;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("The result of division is " + divide(a, b));
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero. It will cause an ArithmeticException");
        }
        return a / b;
    }
}
