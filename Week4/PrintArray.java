import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        // Declare variables
        int numItems;
        int[] items;  // Declare array name, to be allocated after numItems is known
        Scanner sc = new Scanner(System.in);

        // Prompt for a non-negative integer for the number of items;
        // and read the input as "int". No input validation.
        System.out.println("Enter the number of items: ");
        numItems = sc.nextInt();

        // Allocate the array
        items = new int[numItems];

        // Prompt and read the items into the "int" array, if array length > 0
        if (items.length > 0) {
            // Prompting...
            System.out.println("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                // Reading...
                items[i] = sc.nextInt();
            }
        }

        // Print array contents, need to handle first item and subsequent items differently
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                // Print the first item without a leading commas
                System.out.print(items[i]);
            } else {
                // Print the subsequent items with a leading commas
                System.out.print(", " + items[i]);
            }
            // or, using a one liner
            //System.out.print((i == 0) ? items[i] : ", " + items[i]);
        }
        // Print closing bracket
        System.out.println("]");
    }
}
