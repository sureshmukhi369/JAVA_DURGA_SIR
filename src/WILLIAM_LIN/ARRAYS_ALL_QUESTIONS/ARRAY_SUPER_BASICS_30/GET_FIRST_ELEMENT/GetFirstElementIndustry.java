package WILLIAM_LIN.ARRAYS_ALL_QUESTIONS.ARRAY_SUPER_BASICS_30.GET_FIRST_ELEMENT;

public class GetFirstElementIndustry {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("First element: " + getFirstElement(numbers));
    }

    public static int getFirstElement(int[] array) {
        return array[0];
    }
}
