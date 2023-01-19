import java.util.Scanner;

public SumProductMinMax5 Test {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, sum, product, min, max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st integer: ");
        num1 = sc.nextInt();

        System.out.println("Enter 2nd integer: ");
        num2 = sc.nextInt();

        System.out.println("Enter 3rd integer: ");
        num3 = sc.nextInt();

        System.out.println("Enter 4th integer: ");
        num4 = sc.nextInt();

        System.out.println("Enter 5th integer: ");
        num5 = sc.nextInt();

        sum = num1 + num2 + num3 + num4 + num5;
        product = num1 * num2 * num3 * num4 * num5;

        min = num1;
        max = num3;

        if (num2 < num1) {        // Comparing to find min
            min = num2;
        } else if (num3 < num1) {
            min = num3;
        } else if (num4 < num1) {
            min = num4;
        } else if (num5 < num1) {
            min = num5;
        }

        if (num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else if (num4 > num3) {
            max = num4;
        } else if (num5 > num3) {
            max = num5;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);
    }
}
