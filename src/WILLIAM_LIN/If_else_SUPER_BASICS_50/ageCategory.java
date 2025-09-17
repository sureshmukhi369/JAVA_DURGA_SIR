package WILLIAM_LIN.If_else_SUPER_BASICS_50;

import java.util.Scanner;
public class ageCategory {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println((age < 18) ? age + " is a minor." : (age <= 59) ? age + " is an adult." : age + " is a senior citizen.");
    }
}
