package Super_Basics_Switch_Case_Problem;

import java.util.Scanner;

public class vowelOrConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your character: ");
        char ch = scanner.next().charAt(0);

        if (( ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Is a Vowel ");
            } else {
                System.out.println("Is a Consonent ");
            }

        }else {
            System.out.println("Invalid input: ");
        }
    }
}
