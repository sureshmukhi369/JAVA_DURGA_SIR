package Super_Basics_while_loop_Problems;

public class printEvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println("Printed on even numbers from 1 to " + n);

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
