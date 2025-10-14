package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.EVEN_ODD_CHECK;


import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        sc.close();
    }
}
