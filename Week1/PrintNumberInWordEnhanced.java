import java.util.Scanner;

public class PrintNumberInWordEnhanced {
    public static void main(String[] args) {

        // Declare variable Input
        int numberIn;
        Scanner sc = new Scanner(System.in);

        //Getting user input as "int" type
        System.out.println("Enter a number:");
        numberIn = sc.nextInt();

        //Using switch-case to handle 11 cases (0 to 9 and invalid input)
        switch (numberIn) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            default -> System.out.println("OTHER");
        }
        System.out.println("bye!");
    }
}
