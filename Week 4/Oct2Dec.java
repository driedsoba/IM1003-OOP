import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {

        // Declaration of variables
        String octStr;
        char octChar;
        int dec = 0, octStrLen;
        Scanner sc = new Scanner(System.in);

        // Asking for user String input
        System.out.println("Enter an octal string: ");
        octStr = sc.next();
        octStrLen = octStr.length();    // Getting String Length
        sc.close();                     // Close Scanner

        // Process String from left to right
        for (int octStrIdx = 0; octStrIdx < octStrLen; octStrIdx++) {
            // Extracting single character
            octChar = octStr.charAt(octStrIdx);

            // Calculating Exponent and Factor variables
            int exp = octStrLen - 1 - octStrIdx;
            int factor = (int) Math.pow(8, exp);

            // Considering 3 cases '0', '1' - '7', others
            if (octChar == '0') {
                // Do nothing
            } else if (octChar >= 49 && octChar <= 55) {
                dec += (int) ((octChar - '0') * factor);
            } else {
                System.err.println("Invalid Octal String");
            }
        }

        System.out.println("The decimal equivalent is: " + dec);

    }
}
