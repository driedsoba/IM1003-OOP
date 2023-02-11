import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {

        // Declaration of variables
        int numRows, numCol;
        Scanner sc = new Scanner(System.in);


        // Getting user input
        System.out.println("Enter the rows: ");
        numRows = sc.nextInt();

        for (int row = 1; row <= numRows; row++) {

            numCol = 2 * numRows - 1;
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            // Print a newline after all the columns
            System.out.println();
        }
    }
}

