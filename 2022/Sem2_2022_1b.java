
import java.util.Scanner;

public class Sem2_2022_1b {

    public static void main(String[] args) {
        int size;
        char label = 'A';

        System.out.print("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        for (int rows = 1; rows <= size; rows++) {
            System.out.println(label + ":");
            for (int cols = 1; cols <= size; cols++) {
                System.out.println(cols % 2 == 0 ? "-" : "+");
            }
            System.out.println();
            label++;
        }
    }
}
