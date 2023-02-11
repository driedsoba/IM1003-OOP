import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        // Declare variables
        String inStr;   // input String
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
                    case 'a', 'b', 'c' -> System.out.print(2);
                    case 'd', 'e', 'f' -> System.out.print(3);
                    case 'g', 'h', 'i' -> System.out.print(4);
                    case 'j', 'k', 'l' -> System.out.print(5);
                    case 'm', 'n', 'o' -> System.out.print(6);
                    case 'p', 'q', 'r', 's' -> System.out.print(7);
                    case 't', 'u', 'v' -> System.out.print(8);
                    case 'w', 'x', 'y', 'z' -> System.out.print(9);

                    default -> System.out.println("error in input");
                }
            } else {    // printing out number characters
                System.out.print(inStr.charAt(inCharIdx));
            }
        }
    }
}
