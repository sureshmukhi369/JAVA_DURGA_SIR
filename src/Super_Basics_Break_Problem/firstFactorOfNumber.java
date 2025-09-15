package Super_Basics_Break_Problem;

import java.util.Scanner;

public class firstFactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println("This is the first factor: ");
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
