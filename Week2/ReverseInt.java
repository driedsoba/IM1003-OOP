import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        // Declare variables
        int inNumber;   // to be input
        int inDigit;    // each digit
        int reverseNumber = 0;        // to store reverse number
        Scanner sc = new Scanner(System.in);

        // Getting user input for number
        inNumber = sc.nextInt();

        // Extract and drop the "last" digit repeatedly using a while-loop with modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            reverseNumber = (reverseNumber * 10) + inDigit;
            inNumber /= 10;          // drop "last" digit and repeat
        }
        System.out.println("The reverse is: " + reverseNumber);
    }
}
