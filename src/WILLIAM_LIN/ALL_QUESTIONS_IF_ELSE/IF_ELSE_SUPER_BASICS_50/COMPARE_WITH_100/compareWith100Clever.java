package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.COMPARE_WITH_100;

import java.util.Scanner;
public class compareWith100Clever {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println((num > 100) ? (num + " is greater than 100") :
                (num == 100) ? (num + " is equal to 100") :
                        (num + " is less than 100"));
    }
}
