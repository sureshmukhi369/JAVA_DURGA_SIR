package Super_Basics_while_loop_Problems;

public class print1ToN {
    public static void main(String[] args) {

        int n = 5;
        int i = 1;
        System.out.println("Print numbers from 1 to " + n);
        System.out.println();
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
    }
}
