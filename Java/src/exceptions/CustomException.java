package exceptions;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            try {
                throw new EvenNumberException("It's an EvenNumberException. The number is not even.");
            } catch (EvenNumberException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("The number is even");
        }
    }
}

class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}
