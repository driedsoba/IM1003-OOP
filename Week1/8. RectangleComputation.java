import java.util.Scanner;

public class RectangleComputation {
    public static void main(String[] args) {

        // Declaring Variables
        int length, width, perimeter, area;
        Scanner sc = new Scanner(System.in);

        // Getting user input for length and width as "int" type
        System.out.println("Enter the length: ");
        length = sc.nextInt();
        System.out.println("Enter the width: ");
        width = sc.nextInt();

        // Computing perimeter and area
        perimeter = 2 * (length + width);
        area = length * width;

        // Printing results
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

        // Close Scanner
        sc.close();
    }
}
