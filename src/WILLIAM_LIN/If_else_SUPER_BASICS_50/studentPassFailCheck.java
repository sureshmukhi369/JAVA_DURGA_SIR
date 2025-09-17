package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class studentPassFailCheck {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        int marks = new Scanner(System.in).nextInt();

        System.out.println((marks >= 35 && marks <= 100) ? marks + " is Pass." : marks + " is Fail.");
    }
}
