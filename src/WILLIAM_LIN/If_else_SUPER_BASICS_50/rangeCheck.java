package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class rangeCheck {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println((number >= 50 && number <= 100) ? number + " is in the range of 50 to 100" :
                number + " is not in the range of 50 to 100");
    }
}
