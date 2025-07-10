package Super_Basics_while_loop_Problems;

public class factorialOfNumber {
    public static void main(String[] args) {

        int number = 5;
        int fact = 1;
        int i = 1;
        System.out.println("Factorial of num " + number);

        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of num " + number + " is: " + fact);
    }
}
