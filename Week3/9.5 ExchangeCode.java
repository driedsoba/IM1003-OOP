import java.util.Scanner;

public class ExchangeCode {
    public static void main(String[] args) {

        // Declaration of variables
        String inStr;
        int StrLen;
        char inChar, cipherTextChar;
        Scanner sc = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a plaintext string: ");
        inStr = sc.next().toUpperCase();

        // Assigning string length to StrLen
        StrLen = inStr.length();

        // Printing output format
        System.out.println("The ciphertext string is: ");

        // Converting plaintext to ciphertext with the logic, cipherTextChar = 'A' + 'Z' - plainTextChar
        for(int inStrIdx = 0; inStrIdx < StrLen; inStrIdx++) {
            inChar = inStr.charAt(inStrIdx);
            cipherTextChar = (char)('A' + 'Z' - inChar);
            System.out.print(cipherTextChar);
        }
        // Close Scanner
        sc.close();
    }
}
