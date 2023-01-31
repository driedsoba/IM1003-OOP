import java.util.Scanner;

public class ComputePIa {
    public static void main(String[] args) {

        // Declaring Variables
        int maxDenominator;  // to be input
        double sum = 0.0, PI;
        Scanner sc = new Scanner(System.in);

        // Getting user input for maxDenominator
        System.out.println("Enter the maximum denominator: ");
        maxDenominator = sc.nextInt();

        // Calculating sum by considering remainders of denominator
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., maxDenominator
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {
                System.out.println("impossible - error in logic");
            }
        }

        // Computing value of PI based on calculated sum value
        PI = 4.0 * sum;

        // Printing computed PI value
        System.out.printf("The PI computed is: %.10f", PI);
    }
}
