package Super_Basics_Arrays_Problem;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        int sum = 0;

        for (int x : arr) {
            sum += x;
        }
        System.out.print("Sum of Elements: " + sum);
    }
}
