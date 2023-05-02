package exceptions;

import java.util.Scanner;

/*
Write a program that prompts the user to enter two integers and performs the following operations
on them:
1. Adds the two integers together.
2. Subtracts the second integer from the first integer.
3. Multiplies the two integers together.
4. Divides the first integer by the second integer

However, the program should handle any potential exceptions that may occur (such as division by zero) gracefully.
 */
public class MagicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        calculate(a, b);
    }

    private static void calculate(int a, int b) {
        System.out.printf("a + b = %d\n", a + b);
        System.out.printf("a - b = %d\n", a - b);
        System.out.printf("a + b = %d\n", a * b);

        try {
            System.out.printf("a / b = %d\n", a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
