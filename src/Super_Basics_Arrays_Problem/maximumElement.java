package Super_Basics_Arrays_Problem;

public class maximumElement {
    public static void main(String[] args) {
        int[] arr = {10,13,9,3,20};

        int max = arr[0];

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("The maximum element of an Array is: " + max);
    }
}
