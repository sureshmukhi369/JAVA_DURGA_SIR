package Super_Basics_Switch_Case_Problem;

import java.util.Scanner;

public class gradeMeaning {
    public static void main(String[] args) {
        System.out.println("My grade is: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);


        switch (ch) {
            case 'A':
                System.out.println("Excellent"); break;
            case 'B':
                System.out.println("Very Good"); break;
            case 'C':
                System.out.println("Good"); break;
            case 'D':
                System.out.println("Poor"); break;
            case 'F':
                System.out.println("Fail"); break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
