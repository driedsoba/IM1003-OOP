import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {

        // Declaration of variables
        int strLen;
        String inStr;
        char inChar;
        Scanner in = new Scanner(System.in);

        // Asking for input
        System.out.println("Enter a plaintext string: ");
        inStr = in.next().toUpperCase();

        // Assigning string length to strLen variable
        strLen = inStr.length();

        // Printing output format
        System.out.println("The ciphertext string is: ");

        // Converting inStr to ciphertext string through ASCII addition
        for (int inCharIdx = 0; inCharIdx < strLen; inCharIdx++) {
            inChar = inStr.charAt(inCharIdx);

            // Considering cases 'A' to 'W'
            if (inChar >= 65 && inChar <= 87) {
                inChar = (char) (inChar + 3);
                System.out.print(inChar);
            } else if (inChar == 'X') {     // Consider case 'X'
                System.out.print("A");
            } else if (inChar == 'Y') {
                System.out.print("B");
            } else if (inChar == 'Z') {
                System.out.print("C");
            }
        }
    }
}
