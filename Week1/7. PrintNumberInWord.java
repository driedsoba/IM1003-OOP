import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {

        // Declare variable Input
        int numberIn;
        Scanner sc = new Scanner(System.in);

        //Getting user input as "int" type
        System.out.println("Enter a number:");
        numberIn = sc.nextInt();

        //Using switch-case to handle 11 cases (0 to 9 and invalid input)
        switch (numberIn) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            default:
                System.out.println("OTHER");
        }
        System.out.println("bye!");
    }

}
