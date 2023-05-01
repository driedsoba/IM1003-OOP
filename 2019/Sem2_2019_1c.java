import java.util.Scanner;

public class ExchangeCipherMain {

    public static void main(String[] args) {

        System.out.print("Enter a plaintext: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(ExchangeCipher(input));
    }

    public static String ExchangeCipher(String input) {
        char inChar;
        String outStr = "";
        String upperInput = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            inChar = upperInput.charAt(i);

            outStr += (char)('A' + 'Z' - inChar);
        }
        return outStr;
    }
}
