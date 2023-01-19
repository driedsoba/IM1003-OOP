import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {

        // Declaring Variables
        double radius, diameter, circumference, area;
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the radius:");
        radius = sc.nextDouble();

        // Computing output
        area = Math.PI * radius * radius;
        diameter = 2.0 * radius;
        circumference = 2.0 * Math.PI * radius;

        // Printing output
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);

        // Close Scanner
        sc.close();
    }
}
