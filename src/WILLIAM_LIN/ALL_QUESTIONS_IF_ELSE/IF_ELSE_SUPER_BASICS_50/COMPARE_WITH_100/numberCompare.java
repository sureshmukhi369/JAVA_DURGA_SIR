package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.COMPARE_WITH_100;

import java.util.Scanner;
public class numberCompare {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(compareNumber(num));
    }

    public static String compareNumber(int num) {
        if (num > 100) return num + " is greater than 100";
        else if (num == 100) return num + " is equal to 100";
        else return num + " is less than 100";
    }
}
