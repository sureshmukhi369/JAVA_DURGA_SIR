package Super_Basics_for_loop_Problems;

public class printNumbers {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Pring the numbers from 1 to " + num);
        System.out.println();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
