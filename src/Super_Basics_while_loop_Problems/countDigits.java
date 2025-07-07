package Super_Basics_while_loop_Problems;

public class countDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        System.out.println("Count the number " + num);

        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
