import java.util.Scanner;

public class PalindromicWordTest {
    public static void main(String[] args) {

        // Declare variables
        String inStr;           // The input string, need to save for output printing
        String inStrLowerCase;  // The input string in lowercase to reduce the cases in comparison
        int inStrLen;           // The length of the input string
        char forwardChar, backwardChar;   // to compare these two chars, scan forward and backward
        boolean isPalindromic;  // boolean flag
        Scanner sc = new Scanner(System.in);

        // Getting user input for String
        System.out.println("Enter a String: ");
        inStr = sc.next();
        inStrLowerCase = inStr.toLowerCase();
        inStrLen = inStr.length();

        // Reading inStr by comparing characters from front and back at the same time
        isPalindromic = true;     // assume it is true, unless our check fails
        for (int forwardIdx = 0, backwardIdx = inStrLen - 1; forwardIdx < inStrLen / 2; ++forwardIdx, --backwardIdx) {
            forwardChar = inStrLowerCase.charAt(forwardIdx);
            backwardChar = inStrLowerCase.charAt(backwardIdx);
            if (forwardChar != backwardChar) {
                isPalindromic = false;
                break;    // upon the first encounter, no need to go further
            }
        }
        // Printing output based on sorting logic
        if (isPalindromic) {
            System.out.println("\"" + inStr + "\"" + " is palindromic");
        } else {
            System.out.println("\"" + inStr + "\"" + " is not palindromic");
        }
    }
}
