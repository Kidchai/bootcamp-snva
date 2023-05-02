import java.util.Scanner;

public class StudentScore {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the student score program! How many students are you processing?");
        int numberOfStudents = scanner.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            processInfoAboutStudent();
            System.out.println("=====================================");
        }
    }

    public static void processInfoAboutStudent() {
        System.out.println("Enter student registration number: ");
        int registrationNumber = scanner.nextInt();

        System.out.println("Enter student name: ");
        String name = scanner.next();

        System.out.println("Enter student score from Test 1: ");
        int score1 = scanner.nextInt();

        System.out.println("Enter student score from Test 2: ");
        int score2 = scanner.nextInt();

        System.out.println("Enter student score from Test 3: ");
        int score3 = scanner.nextInt();

        System.out.printf("Total score is: %d\n", score1 + score2 + score3);
        int averageScore = (score1 + score2 + score3) / 3;
        System.out.printf("Average score is: %d\n", averageScore);

        if (averageScore > 80) {
            System.out.println("1st class grade");
        } else if (averageScore > 70) {
            System.out.println("2nd class grade");
        } else {
            System.out.println("3rd class grade");
        }
    }
}
