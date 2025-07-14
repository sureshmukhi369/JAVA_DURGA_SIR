package Super_Basics_Arrays_Problem;

public class searchForElement {
    public static void main(String[] args) {
        int[] arr = {20,10,30,50,40};

        int target = 50;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
