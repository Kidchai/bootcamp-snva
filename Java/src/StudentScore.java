import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your registration number: ");
        int registrationNumber = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your score from Test 1: ");
        int score1 = scanner.nextInt();

        System.out.println("Enter your score from Test 2: ");
        int score2 = scanner.nextInt();

        System.out.println("Enter your score from Test 3: ");
        int score3 = scanner.nextInt();

        System.out.printf("Your total score is: %d\n", score1 + score2 + score3);
        int averageScore = (score1 + score2 + score3) / 3;
        System.out.printf("Your average score is: %d\n", averageScore);

        if (averageScore > 80) {
            System.out.println("Your grade is 1st class");
        } else if (averageScore > 70) {
            System.out.println("Your grade is 2nd class");
        } else {
            System.out.println("Your grade is 3rd class");
        }
    }
}
