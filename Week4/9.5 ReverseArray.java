import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        // Declaration of variables
        int numItems;
        int[] numbers;
        Scanner sc = new Scanner(System.in);

        // Reading user input for numItems
        System.out.println("Enter the number of items: ");
        numItems = sc.nextInt();

        // Allocating Array
        numbers = new int[numItems];

        // populating array with user input int values if numItems > 0
        if (numItems > 0) {
            System.out.println("Enter the value of all items (separated by space): ");
            for (int idx = 0; idx < numItems; idx++) {
                numbers[idx] = sc.nextInt();
            }
        }

        // if case 4 with 0 terms in array, else cases 1-3
        if (numbers.length == 0) {
            System.out.println("The original array is: []");
            System.out.println("The reverse is: [] ");
        } else {
            // Printing output template for original array
            System.out.print("The original array is: ");
            print(numbers);

            // Call reverse method to reverse array
            reverse(numbers);

            // Printing output template for reversed array
            System.out.print("The reverse is: ");
            print(numbers);
        }
    }

    public static void reverse(int[] array) {
        // temp variable to hold extracted item
        int temp;
        // array length
        int arrayLen = array.length;

        // for loop to reverse array
        for (int idx = 0; idx < (array.length / 2); idx++) {
            temp = array[idx];                          // holding variable from left
            array[idx] = array[arrayLen - 1 - idx];     // minus 1 cuz length is larger than index by 1, assigning right item to left
            array[arrayLen - 1 - idx] = temp;           // assigning variable from left to right
        }
    }

    public static void print(int[] array) {              // print [x1, x2, ..., xn]
        for (int idx = 0; idx < array.length; idx++) {

            if (array.length > 1) {                             // Consider cases 1 and 2
                if (idx == 0) {                                 // only print bracket once
                    System.out.print("[" + array[idx] + ", ");
                } else if (idx < array.length - 1) {            // printing digits till second last digit of array
                    System.out.print(array[idx] + ", ");
                } else if (idx == array.length - 1) {
                    System.out.print(array[idx] + "]\n");       // last digit of the array
                }
            }
            if (array.length == 1) {                            // Case 3, only one item in array
                System.out.print("[" + array[idx] + "]\n");
            }
        }
    }
}
