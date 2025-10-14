package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.EVEN_ODD_CHECK;


import java.util.Scanner;
public class evenOddChecker {
    public static void main(String[] args) {
    System.out.print("Enter your number: ");
    int number = new Scanner(System.in).nextInt();
    System.out.println(checkEvenOdd(number));
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) return number + " is Even.";
        else return number + " is Odd.";
    }
}
