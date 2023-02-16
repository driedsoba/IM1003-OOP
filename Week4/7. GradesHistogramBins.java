import java.util.Scanner;

public class GradesHistogramBins {
    public static void main(String[] args) {

        // Declare variables
        int numStudents;
        int[] grades;     // Declare array name, to be allocated after numStudents is known
        int[] bins = new int[10];   // int array of 10 histogram bins for 0-9, 10-19, ..., 90-100
        Scanner sc = new Scanner(System.in);

        // Reading input for numStudents
        System.out.println("Enter the number of students: " );
        numStudents = sc.nextInt();

        // Allocate array
        grades = new int[numStudents];

        // Reading input for grades if numStudents > 0
        if(numStudents > 0) {
            for (int idx = 0; idx < numStudents; idx++) {
                System.out.println("Enter the grade for student " + (idx + 1) + ": ");
                grades[idx] = sc.nextInt();
            }
        }

        // Populate the bins
        for (int i = 0; i < grades.length; ++i) {
            if (grades[i] == 100) {   /* Need to handle 90-100 separately as it has 11 items. So we consider 100
                                         as a case in itself */
                ++bins[9];            // eliminating this special case first by adding to bin outside of loop
            } else {
                ++bins[grades[i] / 10];     // logic where 21/10 = 2 and 45/10 = 4
            }
        }

        // Print the bins
        for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            if (binIdx != 9) {   // Need to handle 90-100 separately as it has 11 items.
                System.out.printf("%2d-%3d: ", binIdx * 10, (binIdx * 10) + 9);
            } else {
                System.out.printf("%2d-%3d: ", binIdx * 10, (binIdx * 10) + 10);
            }
            System.out.println(bins[binIdx]);
        }
    }
}
