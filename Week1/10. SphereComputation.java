import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {

        // Declaring variables
        double radius, volume, surfaceArea;
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the radius:");
        radius = sc.nextDouble();

        // Computing output
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (double)4 /3 * Math.PI * radius * radius * radius;

        // Printing output
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        // Close Scanner
        sc.close();
    }
}
