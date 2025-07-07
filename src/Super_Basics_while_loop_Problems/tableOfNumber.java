package Super_Basics_while_loop_Problems;

public class tableOfNumber {
    public static void main(String[] args) {
        int num = 2;
        int i = 1;
        System.out.println("Printing the table of number " + num);

        while (i <= 10) {
            int multiple = num * i;
            System.out.println(num + " X " + i + " = " + multiple);
            i++;
        }
    }
}
