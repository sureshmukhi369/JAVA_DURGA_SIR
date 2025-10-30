package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.CHECK_LARGEST;

import java.util.Scanner;
public class checkerLargestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter your second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter your third number: ");
            int num3 = sc.nextInt();

            System.out.print("Enter your fourth number: ");
            int num4 = sc.nextInt();

//            System.out.println(checkLargest(num1, num2, num3, num4));

        int result = checkLargest(num1, num2, num3, num4);
        System.out.println(result + " is the largest number.");
            sc.close();
    }

    public static int checkLargest(int num1, int num2, int num3, int num4) {
        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        return largest;
    }
}
