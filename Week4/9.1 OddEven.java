import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Declaration of variables
        int number;
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        // Determining output by calling method isOdd
        if(isOdd(number)) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is an even number");
        }
    }

    public static boolean isOdd(int number) {
        // return true if number is odd
        return (number % 2 != 0);
    }
}
