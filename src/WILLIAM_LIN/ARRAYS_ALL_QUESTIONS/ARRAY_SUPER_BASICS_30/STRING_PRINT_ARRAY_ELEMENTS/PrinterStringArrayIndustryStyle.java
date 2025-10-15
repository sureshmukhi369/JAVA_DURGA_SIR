package WILLIAM_LIN.ARRAYS_ALL_QUESTIONS.ARRAY_SUPER_BASICS_30.STRING_PRINT_ARRAY_ELEMENTS;

public class PrinterStringArrayIndustryStyle {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        printArray(fruits);

    }

    public static void printArray(String[] fruits){
        for (String fruit : fruits) {
            System.out.println(fruit + " is good for health.");
        }
    }
}
