package WILLIAM_LIN.If_else_SUPER_BASICS;


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
