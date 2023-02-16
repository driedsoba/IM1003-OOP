import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {

        // Declaration of variables
        String binStr;
        int binStrLen;
        char binChar;
        int dec = 0;
        Scanner sc = new Scanner(System.in);

        // Asking for input
        System.out.println("Enter a binary string: ");
        binStr = sc.next();
        binStrLen = binStr.length();
        sc.close();

        // Processing String from left
        for(int binStrIdx = 0; binStrIdx < binStrLen; binStrIdx++) {
            // Extracting char
            binChar = binStr.charAt(binStrIdx);

            // Considering the 3 cases
            if(binChar == '0') {
                // Do nothing
            } else if(binChar == '1') {
                dec += (int)Math.pow(2, (binStrLen - 1 - binStrIdx));
            } else {
                System.err.println("Invalid Binary String");
                return;
            }
        }
        System.out.println("The decimal equivalent is: " + dec);

    }
}
