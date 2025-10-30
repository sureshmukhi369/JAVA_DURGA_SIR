package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.PROFIT_LOSS;

import java.util.Scanner;
public class ProfitAndLossClever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int costPrice = scanner.nextInt();

        System.out.print("Enter the selling price :");
        int sellingPrice = scanner.nextInt();

        System.out.println((sellingPrice > costPrice) ? "Profit: " + (sellingPrice - costPrice) : (costPrice > sellingPrice) ? "Loss: " + (costPrice - sellingPrice) : "No profit no loss");
   scanner.close();
    }
}
