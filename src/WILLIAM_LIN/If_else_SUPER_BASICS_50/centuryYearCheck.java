package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class centuryYearCheck {
    public static void main(String[] args) {
        System.out.print("Enter your year: ");
        int year = new Scanner(System.in).nextInt();

        System.out.println((year % 100 == 0) ? year + " is a century year" : year + " is not a century year");
    }
}
