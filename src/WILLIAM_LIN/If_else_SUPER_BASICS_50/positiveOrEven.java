package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class positiveOrEven {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num > 0 || num % 2 == 0) ? num + " is satisfied all conditions" :
                num + " is not satisfied all conditions");
    }
}
