import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {

        // Declaration of variables
        int size;
        Scanner sc = new Scanner(System.in);

        // Getting user input for size
        System.out.println("Enter the size: ");
        size = sc.nextInt();

        // Outer loop to print ALL the rows
        for (int row = 1; row <= size; row++) {

            // Inner loop to print ALL the columns of ONE row
            for (int col = 1; col <= size; col++) {

                // For even numbered rows add a blank space infront
                if (row % 2 == 0 && col == 1) {
                    System.out.print(" ");
                }
                System.out.print("# ");
            }
            // Print a newline after all the columns
            System.out.println();
        }
    }
}
