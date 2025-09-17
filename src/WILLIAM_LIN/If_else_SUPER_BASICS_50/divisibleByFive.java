package WILLIAM_LIN.If_else_SUPER_BASICS_50;


import java.util.Scanner;
public class divisibleByFive {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println((number % 5 == 0) ? number + " is divisible by 5." : number + " is not divisible by 5.");
    }
}
