package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.RANGE_CHECK;

import java.util.Scanner;
public class rangeCheckClever {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println((num >= 10 && num <= 100) ? num + " is in the range of 10 to 100" :
                num + " is out of range");

    }
}
