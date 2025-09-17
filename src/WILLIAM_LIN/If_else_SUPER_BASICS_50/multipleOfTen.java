package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class multipleOfTen {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num % 10 == 0) ? num + " is a multiple of 10" : num + " is not a multiple of 10");
    }
}
