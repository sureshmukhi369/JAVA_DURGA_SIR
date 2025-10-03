package WILLIAM_LIN.If_else_SUPER_BASICS_50.LARGEST_NUMBER_CHECK;

import java.util.Scanner;
public class largestNumberChecker {
    public static void main(String[] args) {
        System.out.println("Largest of two numbers: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println(findLargest(num1, num2));
        sc.close();


    }

    public static String findLargest(int num1 , int num2) {
        if (num1 > num2) return num1 + " is the largest number.";
        else if (num2 > num1) return num2 + " is the largest number.";
        else return "Both numbers are equal.";
    }
}
