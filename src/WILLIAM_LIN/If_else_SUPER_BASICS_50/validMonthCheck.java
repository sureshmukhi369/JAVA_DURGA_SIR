package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class validMonthCheck {
    public static void main(String[] args) {
        System.out.print("Enter your month number: ");
        int month = new Scanner(System.in).nextInt();

        System.out.println((month >= 1 && month <= 12) ? month + " is a valid month number" : month + " is not a valid month number");
    }
}
