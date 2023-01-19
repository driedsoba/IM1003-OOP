import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        // Declare variables
        int numberIn;   // input integer
        Scanner sc = new Scanner(System.in);

        // Prompt and read input as "int"
        numberIn = sc.nextInt();
        System.out.println("Enter an integer: ");

        // Check odd/even and print result
        // Use % to find the remainder dividing by 2, and compare with 0
        if (numberIn % 2 == 0) {      // double-equal for comparison
            System.out.println(numberIn + " is even");
        } else {
            System.out.println(numberIn + " is odd");
        }
        System.out.println("bye");
    }
}
