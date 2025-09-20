package WILLIAM_LIN.If_else_SUPER_BASICS_50.CHECK_SIGN_POSITIVE_NEGATIVE_ZERO;

import java.util.Scanner;
public class checkSignV2 {
    public static void main(String[] args) {
        System.out.print("Enter your amount: ");
        int transactionamount = new Scanner(System.in).nextInt();

        System.out.println((transactionamount > 0) ? transactionamount + " is Positive." :
                (transactionamount < 0) ? transactionamount + " is Negative." : transactionamount + " is Zero.");
    }
}
