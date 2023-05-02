import java.util.*;

public class Input_validation {

    public static void main(String[] args) {    // 1
        Scanner input = new Scanner(System.in); // 2
        int numberIn;
        boolean isValid = false;    // 3
        do {
            System.out.print("Enter a number between 0-100: ");
            numberIn = input.nextInt();
            if (numberIn >= 0 && numberIn <= 100) {   // 4 // 5
                isValid = true;
            } else {    // 6
                System.out.println("invalid, try again...");
            }
        } while (!isValid); // 7
        System.out.println("You have entered: " + numberIn);
        input.close();
    }
}
