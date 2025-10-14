package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.LARGEST_NUMBER_CHECK;


import java.util.Scanner;
public class largestOfTwo {
    public static void main(String[] args) {
        System.out.print("Largest of two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
