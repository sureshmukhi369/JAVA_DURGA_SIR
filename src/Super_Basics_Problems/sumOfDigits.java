package Super_Basics_Problems;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

//        System.out.println("Enter your Number: ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();

        int num = 1234;
        System.out.println("The Integer is " + num);
        System.out.println();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of Integer is: " + sum);


    }
}
