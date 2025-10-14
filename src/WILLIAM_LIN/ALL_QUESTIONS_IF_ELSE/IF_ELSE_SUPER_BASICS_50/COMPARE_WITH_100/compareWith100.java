package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.COMPARE_WITH_100;

import java.util.Scanner;
public class compareWith100 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 100) {
            System.out.println(num + " is greater than 100");
        } else if (num == 100) {
            System.out.println(num + " is equal to 100");
        } else {
            System.out.println(num + " is less than 100");
        }
    }
}
