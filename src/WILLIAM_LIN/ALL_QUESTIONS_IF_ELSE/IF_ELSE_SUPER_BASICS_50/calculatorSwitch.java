package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class calculatorSwitch {
    public static void main(String[] args) {
        System.out.print("Enter your first number: ");
        int num1 = new Scanner(System.in).nextInt();

        System.out.print("Enter your second number: ");
        int num2 = new Scanner(System.in).nextInt();

        System.out.print("Enter your operator (+, -, *, /): ");
        char operator = new Scanner(System.in).next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("Result = " + num1 + " + " + num2 + " = " + (num1 + num2));
            case '-' -> System.out.println("Result = " + num1 + " - " + num2 + " = " + (num1 - num2));
            case '*' -> System.out.println("Result = " + num1 + " * " + num2 + " = " + (num1 * num2));
            case '/' -> {
                if (num2 != 0) {
                    System.out.println("Result = " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by Zero is not allowed.");
                }
            }
            default -> System.out.println("Invalid operator selected.");
        }






//        switch (operator) {
//            case '+':
//                System.out.println("Result = " + num1 + " + " + num2 + " = " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Result = " + num1 + " - " + num2 + " = " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Result = " + num1 + " * " + num2 + " = " + (num1 * num2));
//                break;
//            case '/':
//                if (num2 != 0) {
//                    System.out.println("Result = " + num1 + " / " + num2 + " = " + (num1 / num2));
//                } else {
//                    System.out.println("Error: Division by Zero is not allowed.");
//                }
//                break;
//            default:
//                System.out.println("Invalid operator selected.");
//                break;

    }
}
