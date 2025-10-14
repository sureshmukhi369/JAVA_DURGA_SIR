package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class rainCheck {
    public static void main(String[] args) {
        System.out.print("Enter the weather condition (true or false): ");
        boolean isRaining = new Scanner(System.in).nextBoolean();

        System.out.println((isRaining) ? "It's raining" : "It's not raining");
    }
}
