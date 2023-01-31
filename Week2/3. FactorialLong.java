import java.util.Scanner;

public class FactorialLong {
    public static void main(String[] args) {
        // Declaration of variables
        int factorialInt;
        long product = 1;
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter an integer: ");
        factorialInt = sc.nextInt();

        // Calculating factorial using for loop
        for(int counter = 1; counter <= factorialInt; counter++) {
            product *= counter;
        }

        // Printing output
        System.out.println("The Factorial of " + factorialInt + " is: " + product);
    }
}
