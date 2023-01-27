import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        // Declare variables
        int lowerbound, upperbound, sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);

        // Prompt and read inputs as "int"
        System.out.println("Enter the lowerbound: ");
        lowerbound = sc.nextInt();
        System.out.println("Enter the upperbound: ");
        upperbound = sc.nextInt();

        // Compute sum using a for-loop
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
        }

        // Compute average
        average = ((double) (sum)) / (upperbound - lowerbound + 1);

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.printf("The average is: %.2f", average);
    }
}
