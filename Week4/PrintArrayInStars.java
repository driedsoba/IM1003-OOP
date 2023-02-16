import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {

        // Declare variables
        int numItems;
        int[] items;  // Declare array name, to be allocated after numItems is known
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the number of items: ");
        numItems = sc.nextInt();


        // Allocate array
        items = new int[numItems];

        // Prompting and reading items into "int" array, if array length > 0
        if (numItems > 0) {
            // Prompting
            System.out.println("Enter the value of all items (separated by space): ");
            // Reading
            for (int pos = 0; pos < numItems; pos++) {
                items[pos] = sc.nextInt();
            }
        }

        // Print array contents (in index: number of stars) using a nested-loop
        for (int idx = 0; idx < items.length; ++idx) {  // row
            System.out.print(idx + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // col
                System.out.print("*");
            }
            // Printing the number of items at the end
            System.out.print("(" + items[idx] + ")");

            // Printing newline
            System.out.println();
        }
    }
}
