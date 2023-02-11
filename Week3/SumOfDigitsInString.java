import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {

        // Declaration of variables
        String inStr;
        int sumOfDigits = 0, strLen;
        char inChar;
        Scanner sc = new Scanner(System.in);

        // Getting user input for inStr
        System.out.println("Enter a String: ");
        inStr = sc.next();
        strLen = inStr.length();

        // For loop to extract characters from string
        for (int inStrIdx = 0; inStrIdx < strLen; inStrIdx++) {
            inChar = inStr.charAt(inStrIdx);

            // Logic to only consider digit characters
            if (Character.isDigit(inChar)) {
                sumOfDigits += (inChar - '0');  // Convert character to int then add to sum
            }
        }

        // Printing output
        System.out.println("The sum of all digits is: " + sumOfDigits);
    }
}
