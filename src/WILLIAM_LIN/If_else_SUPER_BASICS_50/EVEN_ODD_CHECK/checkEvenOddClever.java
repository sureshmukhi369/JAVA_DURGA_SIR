package WILLIAM_LIN.If_else_SUPER_BASICS_50.EVEN_ODD_CHECK;

import java.util.Scanner;

public class checkEvenOddClever {
    public static void main(String[] args) {
    System.out.print("Enter your number: ");
    int number = new Scanner(System.in).nextInt();

    System.out.println((number % 2 == 0) ? number + " is Even." : number + " is Odd.");
    }
}
