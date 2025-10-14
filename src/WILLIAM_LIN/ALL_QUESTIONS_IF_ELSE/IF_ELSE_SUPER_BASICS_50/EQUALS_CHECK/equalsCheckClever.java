package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.EQUALS_CHECK;

import java.util.Scanner;
public class equalsCheckClever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.println((num1 == num2) ? num1 + " is equal to " + num2 : num1 + " is not equal to " + num2);
    }
}
