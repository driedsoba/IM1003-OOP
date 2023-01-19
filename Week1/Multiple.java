import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        // Declare variables
        int number1, number2;   // two variables number1, number2
        Scanner sc = new Scanner(System.in);

        // Prompt and read input as "int" for two integers
        System.out.println("Enter 1st integer: ");
        number1 = sc.nextInt();

        System.out.println("Enter 2nd integer: ");
        number2 = sc.nextInt();

        // Check odd/even and print result
        // Use % to check if both numbers are multiples
        if (number1 % number2 == 0) {      // double-equal for comparison
            System.out.println(number1 + " IS a multiple of " + number2);
        } else {
            System.out.println(number1 + " IS NOT a multiple of " + number2);
        }
    }
}
