package WILLIAM_LIN.If_else_SUPER_BASICS_50;


import java.util.Scanner;
public class checkLeapYearOrNot {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        int year = new Scanner(System.in).nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                ? year + " is a leap year." : year + " is not a leap year.");
    }
}
