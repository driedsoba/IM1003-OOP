import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Variable Declaration
        String inStr;   // input String
        int inStrLen;   // length of the input String
        Scanner in = new Scanner(System.in);

        // User input for String
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();

        // Use inStr.charAt(index) in a loop to extract character at "index" from inStr.
        // The String's index begins at 0 from the left.

        System.out.print("The reverse is: ");
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {  // Process the String from the right
            // Print the inStr.charAt(charIdx)
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
