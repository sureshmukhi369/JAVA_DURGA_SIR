package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.CHECK_DIVISIBLE_BY_5;


import java.util.Scanner;
public class divisibleBy5 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
        sc.close();
    }
}
