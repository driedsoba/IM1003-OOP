import java.util.Scanner;

public class GradesHistogramVertical {
    public static void main(String[] args) {

        // Declare variables
        int numStudents, lowerBin, upperBin;
        int[] grades;                                   // Declare array name, to be allocated after numStudents is known
        int[] bins = new int[10];                       // int array of 10 histogram bins for 0-9, 10-19, ..., 90-100
        Scanner sc = new Scanner(System.in);

        // Reading input for numStudents
        System.out.println("Enter the number of students: ");
        numStudents = sc.nextInt();

        // Allocate array
        grades = new int[numStudents];

        // Reading input for grades if numStudents > 0
        if (numStudents > 0) {
            for (int idx = 0; idx < numStudents; idx++) {
                System.out.println("Enter the grade for student " + (idx + 1) + ": ");
                grades[idx] = sc.nextInt();
            }
        }

        // Populate the bins
        for (int i = 0; i < grades.length; ++i) {
            if (grades[i] == 100) {                     /* Need to handle 90-100 separately as it has 11 items. So we consider 100
                                                           as a case in itself */
                ++bins[9];                              // eliminating this special case first by adding to bin outside of loop
            } else {
                ++bins[grades[i] / 10];                 // adding count to bins[0-9] with logic where 21/10 = 2 and 45/10 = 4
            }
        }
        // Print the vertical histograms
        int maxItems = max(bins);                       // to find max height of histogram

        // Printing stars
        for (int rows = maxItems; rows > 0; rows--) {
            for (int binNo = 0; binNo < 10; binNo++) {
                if (bins[binNo] >= rows) {
                    System.out.println("   *   ");      // 3 spaces padding
                } else {
                    System.out.println("       ");      // 7 spaces padding
                }
            }
            System.out.println();                       // next row
        }

        // Printing labels
        for (int binNo = 0; binNo < 10; binNo++) {
            lowerBin = 10 * binNo;
            upperBin = 10 * binNo + 9;
            if (upperBin == 99) {
                upperBin = 100;
            }
            System.out.printf("%3d-%-3d", lowerBin, upperBin);
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > max) {
                max = arr[idx];
            }
        }
        return max;
    }
}
