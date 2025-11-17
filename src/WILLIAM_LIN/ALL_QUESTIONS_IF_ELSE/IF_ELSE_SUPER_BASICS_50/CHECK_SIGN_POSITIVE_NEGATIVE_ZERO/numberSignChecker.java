package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.CHECK_SIGN_POSITIVE_NEGATIVE_ZERO;

import java.util.Scanner;
public class numberSignChecker {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();
       scanner.close();
       System.out.print(checkNumber(number));
    }

    public static String checkNumber(int number) {
     if (number > 0) return number + " is Positive.";
     else if (number < 0) return number + " is Negative.";
     else return number + " is Zero.";
    }
}
