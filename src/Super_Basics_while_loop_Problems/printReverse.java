package Super_Basics_while_loop_Problems;

public class printReverse {
    public static void main(String[] args) {
        int n = 5;
        int i = 5;
        System.out.println("Reverse a number from " + n + " to 1");
        System.out.println();
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}
