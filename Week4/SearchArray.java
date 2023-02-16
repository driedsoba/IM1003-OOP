import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        // declaration of variables
        int numItems, key;
        int[] number;
        Scanner sc = new Scanner(System.in);

        // reading input
        System.out.println("Enter the number of items: ");
        numItems = sc.nextInt();

        // allocate array
        number = new int[numItems];

        // populating the array with int user input when numItems > 0
        if (numItems > 0) {
            System.out.println("Enter the value of all items (separated by space): ");
            for (int idx = 0; idx < numItems; idx++) {
                number[idx] = sc.nextInt();
            }
        }

        // reading input for search key
        System.out.println("Enter the search key: ");
        key = sc.nextInt();

        if (search(number, key) > 0) {                       // To prevent out of bounds exception error
            // Printing output with method call
            System.out.print(key + " is found with index " + search(number, key));
        } else {
            System.out.println(key + " is not found");
        }
    }

    public static int search(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (key == array[idx]) {
                return idx;                             // return index when match found
            }
        }
        return -1;                                      // no digits in array match key
    }
}
