package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;


import java.util.Scanner;
public class passOrFailed {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        int marks = new Scanner(System.in).nextInt();

        System.out.println((marks >= 36) ? marks + " is Pass." : marks + " is Fail.");
    }
}
