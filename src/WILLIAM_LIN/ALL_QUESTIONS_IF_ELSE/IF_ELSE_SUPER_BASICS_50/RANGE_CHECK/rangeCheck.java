package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.RANGE_CHECK;

import java.util.Scanner;
public class rangeCheck {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10 && num >= 100) {
            System.out.println(num + " is the range of 10 to 100");
        } else {
            System.out.println(num + " is out of range");
        }
    }
}
