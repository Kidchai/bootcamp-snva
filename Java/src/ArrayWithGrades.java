/*
A teacher wants to keep track of the grades of their students.
They have 5 students in their class and want to use an array to store the grades of each student.
Write a Java program that initializes the array with some sample grades, calculates the average grade,
and outputs the average.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayWithGrades {
    static int numberOfStudents = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the grade program!");
        int[] grades = initializeArray();
        System.out.printf("The average grade is: %s", calculateAverage(grades));

    }

    private static String  calculateAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(sum / numberOfStudents);
    }

    public static int[] initializeArray() {
        int[] array = new int[numberOfStudents];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your students' grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            int grade = scanner.nextInt();
            array[i] = grade;
        }
        return array;
    }
}
