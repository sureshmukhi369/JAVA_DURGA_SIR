package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;


import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
