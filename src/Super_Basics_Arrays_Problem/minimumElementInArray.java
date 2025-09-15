package Super_Basics_Arrays_Problem;

public class minimumElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 11, 2, 1};
        int min = arr[0];

        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Minimum element of an Array: " + min);
    }
}
