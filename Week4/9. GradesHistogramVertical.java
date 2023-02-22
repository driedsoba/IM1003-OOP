import java.util.Scanner;

public class GradesHistogramVertical {
    public static void main(String[] args) {
        int numItems, lowerBin, upperBin, max = 0;
        int[] items;
        int[] numInBin;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numItems = in.nextInt();

        items = new int[numItems];
        numInBin = new int[10];

        if (numItems > 0) {
            for (int index = 0; index < numItems; index++) {
                System.out.print("Enter the grade for student " + (index + 1) + ": ");
                items[index] = in.nextInt();
            }
        }
        in.close();

        // Populate the bins
        for (int index = 0; index < numItems; index++) {
            if (items[index] == 100)
                numInBin[9]++;
            else {
                numInBin[items[index] / 10]++;
            }
        }

        // Find max height of histogram
        for (int bin = 0; bin < 10; bin++) {
            if (numInBin[bin] > max) {
                max = numInBin[bin];
            }
        }
        // Print the stars
        for (int row = max; row > 0; row--) {
            for (int bin = 0; bin < 10; bin++) {
                if (numInBin[bin] >= row)
                    System.out.print("   *   ");
                else
                    System.out.print("       ");
            }
            System.out.println();
        }

        // Print the labels
        for (int bin = 0; bin < 10; bin++) {
            lowerBin = 10 * bin;
            upperBin = 10 * bin + 9;
            if (upperBin == 99)
                upperBin = 100;
            System.out.printf("%3d-%-3d", lowerBin, upperBin);
        }
    }
}
