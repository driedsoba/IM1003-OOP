import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        // Declare constants first (variables may use these constants)
        // The keyword "final" marked these as constant (i.e., cannot be changed).
        // Use uppercase words joined with underscore to name constants
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        // Declare variables
        int taxableIncome;
        double taxPayable;
        Scanner sc = new Scanner(System.in);

        // Getting taxableIncome input
        System.out.println("Enter the taxable income: $");
        taxableIncome = sc.nextInt();


        // Compute tax payable in "double" using a nested-if to handle 4 cases
        if (taxableIncome <= 20000) {         // [0, 20000]
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {  // [20001, 40000]
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {  // [40001, 60000]
            taxPayable = ((taxableIncome - 40000) * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
        } else {                              // [60001, ]
            taxPayable = ((taxableIncome - 60000) * TAX_RATE_ABOVE_60K) + (20000 * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
        }

        // Printing Output
        System.out.printf("The income tax payable is: $%.2f", taxPayable );
    }
}
