package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class picnicWeekendSunday {
    public static void main(String[] args) {
        System.out.print("Is it Sunday? (true or false): ");
        boolean isSunday = new Scanner(System.in).nextBoolean();

        System.out.print("Is it a Weekend? (true or false): ");
        boolean isWeekend = new Scanner(System.in).nextBoolean();

        System.out.println((isSunday && isWeekend) ? "It's a picnic day." : "It's not a picnic day.");
    }
}
