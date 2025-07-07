package Super_Basics_for_loop_Problems;

public class sumIntegerUsingLoop {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Sum of Integer till " + 5);
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
