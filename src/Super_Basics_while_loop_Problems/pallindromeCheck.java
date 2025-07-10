package Super_Basics_while_loop_Problems;

public class pallindromeCheck {

    public static void main(String[] args) {

        int num = 1221;
        int reversed = 0;
        int origitnal = num;

        System.out.println("Check this number " + num + " Pallindrome or not.");

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);

        if (reversed == origitnal) {
            System.out.println("The number " + reversed + " is Pallindrome.");
        }else {
            System.out.println("The number " + reversed + " is not a Pallindrome.");
        }
    }
}
