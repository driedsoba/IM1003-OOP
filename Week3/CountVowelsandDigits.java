import java.util.Scanner;

public class CountVowelsandDigits {
    public static void main(String[] args) {

        // Declaration of variables
        String inStr;
        int vowelCount = 0, digitsCount = 0, inStrLen;
        double vowelPercentage, digitsPercentage;
        char inChar;
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter a String: ");
        inStr = sc.next().toLowerCase();
        inStrLen = inStr.length();      // String length


        // Checking if character in String is vowel or digit
        for (int inCharIdx = 0; inCharIdx < inStrLen; inCharIdx++) {
            inChar = inStr.charAt(inCharIdx);

            // Nested if to differentiate vowels from digits then adding to count
            if (!Character.isDigit(inChar)) {
                if (inChar == 'a' || inChar == 'e' || inChar == 'i'
                        || inChar == 'o' || inChar == 'u' || inChar == 'U') {
                    vowelCount++;
                }
            } else {
                digitsCount++;
            }
        }

        // Calculating percentage of vowels and digits in string
        vowelPercentage = (double) vowelCount / inStrLen * 100;
        digitsPercentage = (double) digitsCount / inStrLen * 100;

        // Printing output
        System.out.printf("Number of vowels is: %d (%.2f%%)%n", vowelCount, vowelPercentage);
        System.out.printf("Number of digits is: %d (%.2f%%)", digitsCount, digitsPercentage);

    }
}

