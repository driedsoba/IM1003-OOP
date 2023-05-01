import java.util.Scanner;   // do not count as error

public class SumOfDigitsInt {
    public static void main(String[] args) { // 1
        int inNumber, sum = 0; // 2
        Scanner input = new Scanner(System.in); // 3
        System.out.println("Enter a positive integer: ");
        inNumber = input.nextInt(); // 4

        while (inNumber > 0) { // 5
            sum += inNumber % 10;
            inNumber /= 10;
        }
        System.out.println("The sum of all digits is " + sum); // 6
        input.close();
    }
}
