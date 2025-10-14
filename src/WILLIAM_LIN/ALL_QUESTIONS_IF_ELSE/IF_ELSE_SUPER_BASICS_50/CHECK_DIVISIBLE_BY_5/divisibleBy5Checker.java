package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.CHECK_DIVISIBLE_BY_5;

import java.util.Scanner;
public class divisibleBy5Checker {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(divisibleBy5(num));
    }

    public static String divisibleBy5(int num) {
        if (num % 5 == 0) return num + " is divisible by 5.";
        else return num + " is not divisible by 5.";
    }
}
