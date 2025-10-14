package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.VOWEL_OR_CONSONENT;

import java.util.Scanner;
public class vowelOrConsonentChecker {
    public static void main(String[] args) {
        System.out.print("Enter your character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(vowelOrConsonent(ch));
    }

    public static String vowelOrConsonent(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return ch + " is a Vowel";
        else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') return ch + " is a Consonent";
        else return ch + " is not an alphabet";
    }
}
