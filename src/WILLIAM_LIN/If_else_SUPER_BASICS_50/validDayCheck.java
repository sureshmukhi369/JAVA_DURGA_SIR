package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class validDayCheck {
    public static void main(String[] args) {
        System.out.print("Enter your day number: ");
        int day = new Scanner(System.in).nextInt();

        System.out.println((day >= 1 && day <= 31) ? day + " is a valid day number" : day + " is not a valid day number");
    }
}
