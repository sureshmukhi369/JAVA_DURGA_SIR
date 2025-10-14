package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;


import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
//        int marks = sc.nextInt();

        int marks = new Scanner(System.in).nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid makrs");
        } else if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 80) {
            System.out.println("B Grade");
        } else if (marks >= 70) {
            System.out.println("C Grade");
        } else if (marks >= 60) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
