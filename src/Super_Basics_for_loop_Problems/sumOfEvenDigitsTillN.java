package Super_Basics_for_loop_Problems;

public class sumOfEvenDigitsTillN {
    public static void main(String[] args) {
        int num = 10;
        System.out.println();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
