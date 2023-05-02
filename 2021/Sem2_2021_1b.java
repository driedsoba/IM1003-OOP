import java.util.Scanner;


public class PrintPattern {
    public static void main(String[] args) {

        int starCount = 0;
        int plusCount = 0;

        System.out.print("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int rows = 0; rows < input; rows++) {

            for(int cols = 0; cols < input; cols++) {
                if (rows == 0 || cols == 0 || rows == input - 1 || cols == input - 1) {
                    System.out.print("*");
                    starCount++;

                } else if (rows + cols == input - 1 || rows == cols) {
                    System.out.print("+");
                    plusCount++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("number of * is " +  starCount);
        System.out.println("number of + is " + plusCount);

    }
}
