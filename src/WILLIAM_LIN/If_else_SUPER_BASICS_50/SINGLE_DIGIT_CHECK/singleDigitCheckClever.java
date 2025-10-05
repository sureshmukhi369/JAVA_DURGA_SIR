package WILLIAM_LIN.If_else_SUPER_BASICS_50.SINGLE_DIGIT_CHECK;


import java.util.Scanner;
public class singleDigitCheckClever {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println((num >= -9 && num <= 9) ? num + " is a single digit number." : num + " is not a single digit number.");
    }
}
