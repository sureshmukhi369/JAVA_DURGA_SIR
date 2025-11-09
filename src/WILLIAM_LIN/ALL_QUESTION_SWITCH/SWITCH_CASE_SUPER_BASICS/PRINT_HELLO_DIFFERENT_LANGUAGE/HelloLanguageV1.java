package WILLIAM_LIN.ALL_QUESTION_SWITCH.SWITCH_CASE_SUPER_BASICS.PRINT_HELLO_DIFFERENT_LANGUAGE;


import java.util.Scanner;
public class HelloLanguageV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 - 5) to print 'Hello' in different languages:\n1. English\n2. Spanish\n3. French\n4. German\n5. Turkish\nYour choice: ");
        int language = scanner.nextInt();


        switch (language) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            case 4:
                System.out.println("Guten Tag");
                break;
            case 5:
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                break;


        }
    }
}
