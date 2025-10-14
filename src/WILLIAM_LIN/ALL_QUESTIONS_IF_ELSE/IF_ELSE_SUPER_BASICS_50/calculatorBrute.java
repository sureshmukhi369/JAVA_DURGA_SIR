package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;

public class calculatorBrute {
    public static void main(String[] args) {
        System.out.print("Enter your first number: ");
        int num1 = new Scanner(System.in).nextInt();

        System.out.print("Enter your second number: ");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println("Choose your operator:");
        System.out.println("1 = Addition (+)");
        System.out.println("2 = Subtraction (-)");
        System.out.println("3 = Multiplication (*)");
        System.out.println("4 = Division (/)");
        int operator = new Scanner(System.in).nextInt();

        if (operator == 1) {
            System.out.println("Result = " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator == 2) {
            System.out.println("Result = " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator == 3) {
            System.out.println("Result = " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operator == 4) {
            if (num2 != 0) {
                System.out.println("Result = " + num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by Zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator selected.");
        }
    }
}
