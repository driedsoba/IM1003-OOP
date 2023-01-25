import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {

        // Declaring variables
        double radius, height, baseArea, surfaceArea, volume;
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
        System.out.println("Enter the height: ");
        height = sc.nextDouble();

        // Computing output
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
        volume = baseArea * height;

        // Printing output
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        // Close Scanner
        sc.close();
    }
}
