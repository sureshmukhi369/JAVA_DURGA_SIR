package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class accendingOrderCheck {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int num3 = new Scanner(System.in).nextInt();

        System.out.println((num1 < num2 && num2 < num3) ? num1 + " < " + num2 + " < " + num3 + " are in ascending order" :
                num1 + " < " + num2 + " < " + num3 + " are not in ascending order");
    }
}
