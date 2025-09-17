package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class characterDigitCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        char ch = new Scanner(System.in).next().charAt(0);

        System.out.println((ch >= '0' && ch <= '9') ? ch + " is a digit." : ch + " is not a digit.");
    }
}
