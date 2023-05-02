
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        int size;
        char label = 'A';

        System.out.print("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        for (int rows = 1; rows <= size; rows++) {
            System.out.print(label + ":");
            for (int cols = 1; cols <= size; cols++) {
                if (cols <= rows) {
                System.out.print(cols % 2 == 0 ? "-" : "+");
                }
            }
            System.out.println();
            label++;
        }
    }
}
