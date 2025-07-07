package Super_Basics_for_loop_Problems;

public class printOddNumbers {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Print the odd numbers from 1 to " + num);
        System.out.println();

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
