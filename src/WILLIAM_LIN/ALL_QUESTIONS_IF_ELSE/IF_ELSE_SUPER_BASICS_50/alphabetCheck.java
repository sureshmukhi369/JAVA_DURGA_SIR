package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class alphabetCheck {
    public static void main(String[] args) {
        System.out.print("Enter a alphabet: ");
        char ch = new Scanner(System.in).next().charAt(0);

        System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ?
                ch + " is an alphabet." : ch + " is not an alphabet.");
    }
}
