package WILLIAM_LIN.If_else_SUPER_BASICS_50.RANGE_CHECK;

import java.util.Scanner;
public class rangeChecker {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkRange(num));
    }

    public static String checkRange(int num) {
        if (num >= 10 && num <= 100) return num + " is in the range of 10 to 100";
        else return num + " is out of range";
    }
}
