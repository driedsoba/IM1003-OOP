import java.util.Scanner;

public class SwapIntegers {

    public static void main(String[] args) {

        // Declaration of variables
        int number1, number2, temp;
        Scanner sc = new Scanner(System.in);

        // Getting user input as "int" type
        System.out.println("Enter the first integer:");
        number1 = sc.nextInt();
        System.out.println("Enter the second integer:");
        number2 = sc.nextInt();

        // Swapping the numbers
        temp = number1;    // storing number1 into temp
        number1 = number2;   // storing number2 into number1
        number2 = temp;     // storing number 1 into number2

        // Printing swap results
        System.out.println("After the swap, first integer is " + number1 +
                            ", second integer is " + number2);

        // Close Scanner
        sc.close();
    }

}
