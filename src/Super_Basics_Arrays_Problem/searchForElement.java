package Super_Basics_Arrays_Problem;

//public class searchForElement {
//    public static void main(String[] args) {
//        int[] arr = {20,10,30,50,40};
//
//        int target = 50;
//
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("Element found at index: " + i);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Element not found");
//        }
//    }
//}



//========================   OPTIMIZED CODE  ============================


public class searchForElement {
    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 55, 30, 55};
        int target = 55;

        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }else {
            System.out.println("Element not found");
        }
    }
}