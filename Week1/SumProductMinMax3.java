import java.util.Scanner;

public class SumProductMinMax3 {

    public static void main(String[] args) {

        int num1, num2, num3, sum, product, min, max;

        Scanner sc = new Scanner(System.in);		// Creating Scanner class object

        System.out.println("Enter 1st integer: ");	// Getting user input 
        num1 = sc.nextInt();

        System.out.println("Enter 2nd integer: ");
        num2 = sc.nextInt();

        System.out.println("Enter 3rd integer: ");
        num3 = sc.nextInt();

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        min = num1;
        max = num3;

        if (num2 < num1) {        // Comparing to find min
            min = num2;
        } else if (num3 < num1) {
            min = num3;
        }

        if (num1 > num3) {		// Comparing to find max
            max = num3;
        } else if (num2 > num3) {
            max = num2;
        }

        System.out.println("The sum is " + sum);		// Printing results
        System.out.println("The product is " + product);
        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);
    }
}
