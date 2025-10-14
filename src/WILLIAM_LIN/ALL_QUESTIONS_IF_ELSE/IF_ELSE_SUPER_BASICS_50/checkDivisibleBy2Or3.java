package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class checkDivisibleBy2Or3 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num % 2 != 0 || num % 3 != 0) ? num + " is not divisible by 2 or 3" :
                num + " is divisible by both 2 or 3");

    }
}
