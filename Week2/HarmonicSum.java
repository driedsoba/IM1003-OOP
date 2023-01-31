import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        // Declare variables
        int maxDenominator;   // to be input
        double sumL2R = 0.0, sumR2L = 0.0, absDiff;  // to compute these in "double"
        Scanner sc = new Scanner(System.in);

        // Prompt and read inputs as "int"
        System.out.println("Enter the max denominator: ");
        maxDenominator = sc.nextInt();

        // Compute sum from left-to-right in "double"
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += 1.0 / denominator;
        }

        // Compute sum from right-to-left in "double"
        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += 1.0 / denominator;
        }

        // Compute the absolute difference in "double"
        absDiff = sumL2R - sumR2L;
        if (absDiff < 0) {
            absDiff = -absDiff;
        }

        // Print results in full precision using println()
        System.out.println("The sum from left-to-right is: " + sumL2R);
        System.out.println("The sum from right-to-left is: " + sumR2L);
        System.out.println("The absolute difference is: " + absDiff);
    }
}
