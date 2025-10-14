package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;


import java.util.Scanner;
public class characterCaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        char ch = new Scanner(System.in).next().charAt(0);

        System.out.println((ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                (ch >= 'a' && ch <= 'z') ? "Lowercase" :
                 "Invalid input");
    }
}
