package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.EQUALS_CHECK;

import java.util.Scanner;
public class equalsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();


        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is not equal to " + num2);
        }
    }
}
