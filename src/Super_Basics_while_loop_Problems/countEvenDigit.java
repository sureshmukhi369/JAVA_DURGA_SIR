package Super_Basics_while_loop_Problems;

public class countEvenDigit {
    public static void main(String[] args) {
        int num = 1233;
        int count = 0;
        System.out.println("Count the even digit numbers from " + num);

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.print("This is count of even numbers " + count);

    }
}
