package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class seniorDiscountEligibility {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println((age >= 60) ? age + " is eligible for senior citizen discoutn." : age + " is not eligible for seniro citizen discoutn.");
    }
}
