import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        //Declare Variable Input
        int dayNumber;
        Scanner sc = new Scanner(System.in);

        //Prompt and read input as "int"
        System.out.println("Enter the day number: ");
        dayNumber = sc.nextInt();

        //Using nested-if to handle the 8 cases (0 to 6 and invalid inputs)
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
        System.out.println("bye");
        sc.close();
    }
}
