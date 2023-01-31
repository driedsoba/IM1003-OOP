import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        // Declare constant
        final int NUM_STUDENTS = 3;

        // Declare variables
        int numberIn;
        boolean isValid;   // boolean flag to control the input validation loop
        int sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            // Prompt user for mark with input validation
            isValid = false;   // reset for each student assuming input is not valid
            do {
                System.out.printf("Enter the mark (0-100) for student %d : ", studentNo);
                numberIn = sc.nextInt();

                // If input is valid, eet isValid = true to exit the loop
                // Else, print error message and repeat
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                }

            } while (!isValid);

            sum += numberIn;
        }

        // Calculating average
        average = (double)sum / NUM_STUDENTS;

        System.out.printf("The average is: %.2f", average);
    }
}
