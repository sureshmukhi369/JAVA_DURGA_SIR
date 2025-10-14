package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50;

import java.util.Scanner;
public class gradeCheck {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        int marks = new Scanner(System.in).nextInt();

        System.out.println((marks < 0 && marks > 100) ? "Invalid marks" :
                (marks >= 90) ? "A Grade" :
                (marks >= 80) ? "B Grade" :
                (marks >= 70) ? "C Grade" :
                (marks >= 60) ? "D Grade" : "Fail");
    }
}
