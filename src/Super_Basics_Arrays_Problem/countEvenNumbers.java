package Super_Basics_Arrays_Problem;

//public class countEvenNumbers {
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 5, 7, 8};
//
//        int count = 0;
//
//        for (int x : arr) {
//            if (x % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("Count of even numbers is: " + count);
//    }
//}



//======================= OPTIMIZED CODE  ===================================


public class countEvenNumbers {
    public static int countEven(int[] arr) {
        int count = 0;

        for (int x : arr) {
            if (x % 2 == 0) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        int[] arr = {-2, 1, 4, 5, 7, 8};
        System.out.println("Count of even numbers is: " + countEven(arr));
    }
}