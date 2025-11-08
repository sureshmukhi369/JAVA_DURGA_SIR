package WILLIAM_LIN.ALL_QUESTION_SWITCH.SWITCH_CASE_SUPER_BASICS.VOWEL_OR_CONSONENT;


import java.util.Scanner;
public class VowelOrConsonentSimpleV1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an alphabetic character: ");
    char character = scanner.next().charAt(0);

        switch (character) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:
                if (!((character <= 'a' && character >= 'z') || (character <= 'A' && character >= 'Z'))) {
                    System.out.println("Invalid input! Please enter an alphabetic character.");
                }else {
                    System.out.println("The character is a consonant.");
                }
        }
    }
}
