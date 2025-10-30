package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.CHECK_LARGEST;

import java.util.Scanner;
public class largestOfFourClever {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter your fourth number: ");
        int num4 = sc.nextInt();

        int largest = Math.max(Math.max(num1, num2), Math.max(num3, num4));

        System.out.println(largest + " is the largest number");
    }
}
