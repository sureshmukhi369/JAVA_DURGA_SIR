package WILLIAM_LIN.ARRAYS_ALL_QUESTIONS.ARRAY_SUPER_BASICS_30.INTEGER_PRINT_ARRAY_ELEMENTS;

public class PrintArrayElementsIndustryStyle {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.println(num);
        }
    }
}
