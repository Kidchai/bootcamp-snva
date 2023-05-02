package exceptions.unchecked;

import java.util.Scanner;

/*
Write a program that prompts the user to enter a non-negative integer and computes its factorial.

If the user enters a negative integer,the program should print an error message and prompt the user again until a
non-negative integer is entered.
 */
public class Factorial {
    public static void main(String[] args) {
        boolean isNegative = true;

        while (isNegative) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a non-negative integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                try {
                    throw new NegativeNumberException("The number is negative. Please, try again");
                } catch (NegativeNumberException e) {
                    isNegative = true;
                    System.out.println(e.getMessage());
                }
            } else {
                isNegative = false;
                System.out.printf("%d! = %d\n", number, factorial(number));
            }
        }
    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}