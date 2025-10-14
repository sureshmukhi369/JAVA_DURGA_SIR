package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class specialCharacterCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        char ch = new Scanner(System.in).next().charAt(0);

        System.out.println(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) ?
                ch + " is special character." : ch + " is not a special character.");
    }
}
