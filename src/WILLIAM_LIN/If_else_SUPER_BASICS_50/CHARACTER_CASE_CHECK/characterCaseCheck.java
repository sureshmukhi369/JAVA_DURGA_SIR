package WILLIAM_LIN.If_else_SUPER_BASICS_50.CHARACTER_CASE_CHECK;

import java.util.Scanner;
public class characterCaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter you character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(characterCaseChecker(ch));
    }

    public static String characterCaseChecker(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch + " is a lowercase letter";
        } else if (ch >= 'A' && ch <= 'Z') {
            return ch + " is an uppercase letter";
        } else {
            return ch + " is not an alphabet";
        }
    }
}
