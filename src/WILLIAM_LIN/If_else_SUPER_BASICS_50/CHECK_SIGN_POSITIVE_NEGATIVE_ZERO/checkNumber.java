package WILLIAM_LIN.If_else_SUPER_BASICS_50.CHECK_SIGN_POSITIVE_NEGATIVE_ZERO;


import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        System.out.print("Enter your amount: ");
        int transactionamount = new Scanner(System.in).nextInt();

        if (transactionamount > 0) {
            System.out.println(transactionamount + " is Positive.");
        } else if (transactionamount < 0) {
            System.out.println(transactionamount + " is Negative.");

        } else {
            System.out.println(transactionamount + " is Zero.");
        }
    }
}
