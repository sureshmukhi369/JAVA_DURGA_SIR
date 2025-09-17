package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class drivingLicenseEligibility {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println((age >= 18) ? age + " is eligible to get a driving license" : age + " is not eligible to get a driving license.");
    }
}
