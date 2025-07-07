package Super_Basics_Problems;

public class reverseNegativeNumber {
    public static void main(String[] args) {
        int num = -12345;
        System.out.println("The Number is " + num);
        System.out.println();
        boolean isNegative = num < 0;
        num = Math.abs(num);
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (isNegative) {
            reversed = -reversed;
        }
        System.out.println("The reversed number is: " + reversed);
    }
}
