import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {

        // Declaration of variables
        int size; // size of table
        Scanner sc = new Scanner(System.in);

        // Asking for user input
        System.out.println("Enter the size of the table: ");
        size = sc.nextInt();

        // Print header row
        System.out.print(" * |");
        for (int col = 1; col <= size; ++col) {
            System.out.print("   " + col);
        }
        System.out.println(); // End row with newline
        System.out.print("===+"); // print separator row
        for (int col = 1; col <= size; ++col) {
            System.out.print("====");
        }
        System.out.println(); // End row with newline
        // Print body
        for (int row = 1; row <= size; ++row) { // outer loop
            System.out.print(" " + row + " |"); // print row header
            for (int col = 1; col <= size; ++col) { // inner loop
                System.out.printf("%4d", row * col); // formatted output
            }
            System.out.println(); // End row with newline
        }
    }
}
