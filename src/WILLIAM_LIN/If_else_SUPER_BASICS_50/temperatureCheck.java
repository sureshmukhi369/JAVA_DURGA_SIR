package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class temperatureCheck {
    public static void main(String[] args) {
        System.out.print("Enter your temperature: ");
        int temp = new Scanner(System.in).nextInt();

        System.out.println((temp < 15) ? temp + " is too cold." : (temp <= 25) ? temp + " is moderate." : temp + " is too hot.");
    }
}
