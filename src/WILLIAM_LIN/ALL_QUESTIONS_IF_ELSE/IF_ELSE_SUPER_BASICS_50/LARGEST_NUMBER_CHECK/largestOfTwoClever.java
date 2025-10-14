package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.LARGEST_NUMBER_CHECK;


import java.util.Scanner;
public class largestOfTwoClever {
    public static void main(String[] args) {
        System.out.print("Largest of two numbers: ");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        System.out.println((num1 > num2) ? num1 + " is the largest number." :
        (num2 > num1) ? num2 + " is the largest number." : "Both numbers are equal.");
    }
}
