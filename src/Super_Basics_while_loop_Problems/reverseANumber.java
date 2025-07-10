package Super_Basics_while_loop_Problems;

public class reverseANumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        System.out.println("Reversed a number " + num);

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
