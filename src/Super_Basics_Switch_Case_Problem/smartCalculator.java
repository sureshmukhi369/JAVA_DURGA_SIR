package Super_Basics_Switch_Case_Problem;

import java.util.Scanner;

public class smartCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a + b)); break;
            case '*': System.out.println("Result: " + (a + b)); break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            case '%':
                if (b != 0)
                    System.out.println("Result: " + (a % b));
                else
                    System.out.println("Error: Modulo by zero");
                break;
            default:
                System.out.println("Invalid operator");

        }
    }
}
