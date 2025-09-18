package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class divisionCheckNumratorDinominator {
    public static void main(String[] args) {
        System.out.print("Enter your numerator: ");
        int numerator = new Scanner(System.in).nextInt();

        System.out.print("Enter your denominator: ");
        int denominator = new Scanner(System.in).nextInt();

        System.out.println((denominator == 0) ? denominator + " Error: Division by zero is not allowed" :
                "Result = " + numerator + " / " + denominator + " = " + (numerator / denominator));
    }
}
