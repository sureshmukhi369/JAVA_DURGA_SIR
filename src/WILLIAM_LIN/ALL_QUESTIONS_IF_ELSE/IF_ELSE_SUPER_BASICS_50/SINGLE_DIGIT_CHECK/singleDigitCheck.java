package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.SINGLE_DIGIT_CHECK;


import java.util.Scanner;
public class singleDigitCheck {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= -9 && num <= 9) {
            System.out.println(num + " is a single digit number.");
        } else {
            System.out.println(num + " is not a single digit number.");
        }
        sc.close();
    }
}
