package WILLIAM_LIN;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber of units consumed: ");
        int n = sc.nextInt();


        double Total;
        if(n <100){
            Total = n * 1.5;
        }else if(n > 100 && n < 200){
            Total = n * 2.5;
        }else{
            Total = n * 4;
        }
        System.out.println("Total bill: " + Total);
    }
}
