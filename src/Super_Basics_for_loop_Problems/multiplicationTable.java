package Super_Basics_for_loop_Problems;

public class multiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Print the multiplication table of " + num);
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
