package WILLIAM_LIN.If_else_SUPER_BASICS;


import java.util.Scanner;
public class passOrFailed {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        int marks = new Scanner(System.in).nextInt();

        System.out.println((marks >= 36) ? marks + " is Pass." : marks + " is Fail.");
    }
}
