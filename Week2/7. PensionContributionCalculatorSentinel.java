import java.util.Scanner;

public class PensionContributionCalculatorSentinel {
    public static void main(String[] args) {

        // Declare constants
        final int SENTINEL = -1;
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;


        // Declare variables
        int salary, age;     // to be input
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);


        // Read the first input to "seed" the while loop
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();


        // Check the contribution cap
        if (salary > 6000) {
            contributableSalary = SALARY_CEILING;
        } else {
            contributableSalary = salary;
        }


        while (salary != SENTINEL) {
            // Read the rest of inputs
            System.out.print("Enter the age: ");
            age = in.nextInt();

            // Compute various contributions in "double" using a nested-if to handle 4 cases
            if (age <= 55) {         // 55 and below
                employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
            } else if (age <= 60) {  // (60, 65]
                employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
            } else if (age <= 65) {  // (55, 60]
                employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
            } else {                 // above 65
                employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
            }


            // Calculating total contributions
            totalContribution = employeeContribution + employerContribution;


            // Printing output
            System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
            System.out.printf("The total contribution is: $%.2f%n", totalContribution);


            // Read the next input and repeat
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = in.nextInt();
        }

        System.out.println("bye!");
    }
}
