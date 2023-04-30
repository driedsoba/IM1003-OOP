import java.util.Scanner;

public class DropVowels {

    public static void main(String[] args) {

        System.out.print("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.nextLine();
        System.out.println(dropVowels(inStr));
    }

    public static String dropVowels(String inStr) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        char inChar;
        boolean isVowel;
        String outStr = "";

        for (int i = 0; i < inStr.length(); i++) {
            inChar = inStr.charAt(i);
            isVowel = false;

            for (int j = 0; j < vowels.length; j++) {
                if (inChar == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                outStr += inChar;
            }
        }
        return outStr;
    }
}
