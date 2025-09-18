package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class positiveEvenGreaterthan10 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num > 0 && num % 2 == 0 && num > 10) ? num + " all conitions are satisfied" :
                num + " all conditions are not satisfied");
    }
}
