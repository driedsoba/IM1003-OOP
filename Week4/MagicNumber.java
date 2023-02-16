import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        // Declaration of variables
        int number, extNum, dummyNumber;        // use of dummy variable to preserve initial value of number variable
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.println("Enter a positive integer: ");
        number = sc.nextInt();
        dummyNumber = number;

        // Reducing the number of digits through while loop iteration
        while (dummyNumber != 0) {

            extNum = dummyNumber % 10;         // extracting last digit from number
            if (extNum == 8) {
                System.out.println(number + " is a magic number");
                break;                         // exit loop if 8 is found to be extracted
            }
            dummyNumber = dummyNumber / 10;    // removing last digit from number
        }
        if (dummyNumber == 0) {
            System.out.println(number + " is not a magic number");   // if loop does not end prematurely means not a magic number
        }
    }
}
