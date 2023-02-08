import java.util.Scanner;

public class TriangularPatternA {
    public static void main(String[] args) {

        // Declaration of variables
        int size;
        Scanner sc = new Scanner(System.in);

        // User int input for size
        System.out.println("Enter the size: ");
        size = sc.nextInt();

        // Printing number of stars based on user input
        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("*");
                }
            }
            // Print a newline after all the columns
            System.out.println();
        }
    }
}
