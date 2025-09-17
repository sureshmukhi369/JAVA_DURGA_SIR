package WILLIAM_LIN.If_else_SUPER_BASICS_50;


import java.util.Scanner;
public class singleDigitCheck {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num >= -9 && num <= 9) ? num + " is a Signle digit number" : num + " is a Double digit number");
    }
}
