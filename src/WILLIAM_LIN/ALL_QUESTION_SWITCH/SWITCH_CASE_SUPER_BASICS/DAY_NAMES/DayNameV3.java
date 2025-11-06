package WILLIAM_LIN.ALL_QUESTION_SWITCH.SWITCH_CASE_SUPER_BASICS.DAY_NAMES;


import java.util.Scanner;
public class DayNameV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayNamme = getDayName(dayNumber);
        System.out.println(dayNamme);
    }

    public static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid input! Please enter a number between 1 and 7";
        }
    }
}
