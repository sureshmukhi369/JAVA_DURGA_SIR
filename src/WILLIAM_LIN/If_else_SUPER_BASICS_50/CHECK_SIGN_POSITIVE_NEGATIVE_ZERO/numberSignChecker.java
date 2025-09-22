package WILLIAM_LIN.If_else_SUPER_BASICS_50.CHECK_SIGN_POSITIVE_NEGATIVE_ZERO;

import java.util.Scanner;
public class numberSignChecker {
    public static void main(String[] args) {
       System.out.print("Enter your number: ");
       int number = new Scanner(System.in).nextInt();
       System.out.print(checkNumber(number));
    }

    public static String checkNumber(int number) {
     if (number > 0) return number + " is Positive.";
     else if (number < 0) return number + " is Negative.";
     else return number + " is Zero.";
    }
}
