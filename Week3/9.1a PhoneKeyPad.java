import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        // Declare variables
        String inStr;   // input
        // String
        int inStrLength;   // length of the input String
        char inChar;    // each individual char in the string
        Scanner in = new Scanner(System.in);

        // Getting user input and converting to lowercase
        System.out.println("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLength = inStr.length();

        // Printing output format
        System.out.println("The phone number is: ");


        for (int inCharIdx = 0; inCharIdx < inStrLength; ++inCharIdx) {
            inChar = inStr.charAt(inCharIdx);

            // filtering out number characters from inStr
            if (inChar > 60) {
                switch (inChar) {

                    // case 'a': case 'b': case 'c':
                    // same as: if (inChar == 'a' || inChar == 'b' || inChar == 'c')
                    case 'a': case 'b': case 'c': System.out.print(2); break;
                    case 'd': case 'e': case 'f': System.out.print(3); break;
                    case 'g': case 'h': case 'i': System.out.print(4); break;
                    case 'j': case 'k': case 'l': System.out.print(5); break;
                    case 'm': case 'n': case 'o': System.out.print(6); break;
                    case 'p': case 'q': case 'r': case 's':System.out.print(7); break;
                    case 't': case 'u': case 'v': System.out.print(8); break;
                    case 'w': case 'x': case 'y': case 'z': System.out.print(9); break;

                    default: System.out.println("error in input");
                }
            } else {    // printing out number characters
                System.out.print(inStr.charAt(inCharIdx));
            }
        }
    }
}
