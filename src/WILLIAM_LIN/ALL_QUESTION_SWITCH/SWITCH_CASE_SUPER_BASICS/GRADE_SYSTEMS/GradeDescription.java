package WILLIAM_LIN.ALL_QUESTION_SWITCH.SWITCH_CASE_SUPER_BASICS.GRADE_SYSTEMS;


import java.util.Scanner;
public class GradeDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Failing");
                break;
            default:
                System.out.println("Invalid grade entered");
                break;
        }
        scanner.close();
    }
}
