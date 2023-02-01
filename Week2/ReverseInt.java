import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        // Declare variables
        int inNumber;   // to be input
        int inDigit;    // each digit
        int reverseNumber = 0;        // to store reverse number
        Scanner sc = new Scanner(System.in);

        // Getting user input for number
        System.out.println("Enter a positive integer: ");
        inNumber = sc.nextInt();

        // Printing the reverse statement
        System.out.print("The reverse is: ");

        // Extract and drop the "last" digit repeatedly using a while-loop with modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            System.out.print(inDigit);
            inNumber /= 10;          // drop "last" digit and repeat
        }
    }
}
