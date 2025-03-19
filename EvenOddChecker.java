import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput(Scanner input) {
        System.out.print("Enter an integer: ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            input.next();
            System.out.print("Enter an integer: ");
        }

        return input.nextInt();
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an even number.";
        } else {
            return number + " is an odd number.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = getIntegerInput(input);
        String result = checkEvenOrOdd(number);
        System.out.println(result);

        input.close();
    }
}
