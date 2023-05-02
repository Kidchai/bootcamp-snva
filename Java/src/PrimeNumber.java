import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the prime number program!");
        System.out.println("Enter a number to check if it is prime:");
        int number = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "The number is prime" : "The number is not prime");
    }
}
