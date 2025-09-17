package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class divisibleBy2And3 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num % 2 == 0 && num % 3 == 0) ? num + " is divisible by 2 and 3" : num + " is not divisible by 2 and 3");
    }
}
