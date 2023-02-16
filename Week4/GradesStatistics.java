import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        // Declaration of variables
        int numStudents;
        int[] grades;
        Scanner sc = new Scanner(System.in);

        // Getting input from user for numStudents
        System.out.println("Enter the number of students: ");
        numStudents = sc.nextInt();

        // Allocate array
        grades = new int[numStudents];

        // Prompting and reading items into "int" array if numStudents > 0
        if (numStudents > 0) {
            for (int idx = 0; idx < numStudents; idx++) {
                System.out.println("Enter the grade for student " + (idx + 1) + ": ");
                grades[idx] = sc.nextInt();
            }
        }
        // Printing output for average, minimum and maximum
        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
    }

    public static double average(int[] arr) {
        int sumOfGrades = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            sumOfGrades += arr[idx];
        }
        return (double) sumOfGrades / arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > max) {
                max = arr[idx];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < min) {
                min = arr[idx];
            }
        }
        return min;
    }
}