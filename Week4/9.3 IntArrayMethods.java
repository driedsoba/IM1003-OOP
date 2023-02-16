import java.util.Scanner;

public class IntArrayMethods {
    public static void main(String[] args) {

        // Declaration of variables
        int numItems;
        int[] number;
        Scanner sc = new Scanner(System.in);

        // Reading input for numItems
        System.out.println("Enter the number of items: ");
        numItems = sc.nextInt();

        // Allocate array
        number = new int[numItems];

        // Populating number array with user input int values while numItems > 0
        if (numItems > 0) {
            // Prompting...
            System.out.println("Enter the value of all items (separated by space): ");
            for (int idx = 0; idx < numItems; idx++) {
                // Reading...
                number[idx] = sc.nextInt();
            }
        }
        // First row of output for print()
        System.out.print("The values are: ");
        print(number);
        System.out.println();

        // Second row of output for min()
        System.out.printf("The min is: %d", min(number));
        System.out.println();

        // Third row of output for max()
        System.out.printf("The max is: %d", max(number));
        System.out.println();

        // Fourth row of output for sum()
        System.out.printf("The sum is: %d", sum(number));
        System.out.println();

        // Fifth row of output for average()
        System.out.printf("The average (rounded to 2 decimal places) is: %.2f", average(number));
        System.out.println();

        // Sixth row of output for isEmpty()
        if (isEmpty(number)) {
            System.out.println("This array is empty");
        } else {
            System.out.println("This array is not empty");
        }
    }

    public static void print(int[] array) {              // print [x1, x2, ..., xn]
        for (int idx = 0; idx < array.length; idx++) {

            if (array.length != 1) {                            // Consider cases 1 and 2
                if (idx == 0) {                                 // only print bracket once
                    System.out.print("[" + array[idx] + ", ");
                } else if (idx < array.length - 1) {            // printing digits till second last digit of array
                    System.out.print(array[idx] + ", ");
                } else if (idx == array.length - 1) {
                    System.out.print(array[idx] + "]");         // last digit of the array
                }
            }
            if (array.length == 1) {                            // Case 3
                System.out.print("[" + array[idx] + "]");
            }
        }
    }

    public static int min(int[] array) {                // Returns the minimum
        int min = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        return min;
    }

    public static int max(int[] array) {                // Returns the maximum
        int max = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > max) {
                max = array[idx];
            }
        }
        return max;
    }

    public static int sum(int[] array) {             // Returns the sum
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        return sum;
    }

    public static double average(int[] array) {     // Returns the average in double
        return (double) sum(array) / array.length;     // method call to sum()
    }

    public static boolean isEmpty(int[] array) { // Returns true if array's length is 0
        return array.length == 0;
    }
}
