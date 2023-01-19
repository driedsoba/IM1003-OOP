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
                System.out.println("bye!");
                break;
            case 1:
                System.out.println("ONE");
                System.out.println("bye!");
                break;
            case 2:
                System.out.println("TWO");
                System.out.println("bye!");
                break;
            case 3:
                System.out.println("THREE");
                System.out.println("bye!");
                break;
            case 4:
                System.out.println("FOUR");
                System.out.println("bye!");
                break;
            case 5:
                System.out.println("FIVE");
                System.out.println("bye!");
                break;
            case 6:
                System.out.println("SIX");
                System.out.println("bye!");
                break;
            case 7:
                System.out.println("SEVEN");
                System.out.println("bye!");
                break;
            case 8:
                System.out.println("EIGHT");
                System.out.println("bye!");
                break;
            default:
                System.out.println("OTHER");
                System.out.println("bye!");
        }
    }

}
