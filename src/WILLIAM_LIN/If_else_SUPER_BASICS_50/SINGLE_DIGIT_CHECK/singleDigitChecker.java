package WILLIAM_LIN.If_else_SUPER_BASICS_50.SINGLE_DIGIT_CHECK;

import java.util.Scanner;
public class singleDigitChecker {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(singleDigitCheck(num));
        sc.close();
    }

    public static String singleDigitCheck(int num) {
        if (num >= -9 && num <= 9) return num + " is a single digit number.";
        else return num + " is not a single digit number.";
    }
}
