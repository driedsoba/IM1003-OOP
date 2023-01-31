import java.util.Scanner;

public class SalespersonSalary {
    public static void main(String[] args) {

        // Declare constants
        // The keyword "final" marked these as constant (i.e., cannot changed).
        // Use uppercase words joined with underscore to name constants
        final double BASE_SALARY = 1000;
        final double COMMISSION_RATE = 0.15;
        final int SENTINEL = -1;        // Terminating value for input

        // Declare variables
        int sales;       // Input gross sales
        double salary;   // Salary to be computed
        Scanner in = new Scanner((System.in));

        // Read the first input to "seed" the while loop
        System.out.print("Enter sales in dollars (or -1 to end): ");
        sales = in.nextInt();

        while (sales != SENTINEL) {
            // Compute the salary in "double"
            salary = BASE_SALARY + (sales * COMMISSION_RATE);

            // Print results rounded to 2 decimal places
            System.out.printf("Salary is: $%.2f%n", salary);
            System.out.println("");

            // Read the next input
            System.out.print("Enter sales in dollars (or -1 to end): ");
            sales = in.nextInt();
            // Repeat the loop body, only if the input is not the SENTINEL value.
            // Take note that you need to repeat these two statements inside/outside the loop!
        }
        System.out.println("bye");
    }
}
