package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class voteEligibility {
    public static void main(String[] args) {
        System.out.print("Enter your age. ");
        int age = new Scanner(System.in).nextInt();

        System.out.println((age >= 18) ? age + " is eligible to vote." : age + " is not eligible to vote.");
    }
}
