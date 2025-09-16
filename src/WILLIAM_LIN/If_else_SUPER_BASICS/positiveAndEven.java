package WILLIAM_LIN.If_else_SUPER_BASICS;


import java.util.Scanner;
public class positiveAndEven {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println((num > 0 && num % 2 == 0) ? num + " is Positive and even number" : num + " is not Positive and even number");
    }
}
