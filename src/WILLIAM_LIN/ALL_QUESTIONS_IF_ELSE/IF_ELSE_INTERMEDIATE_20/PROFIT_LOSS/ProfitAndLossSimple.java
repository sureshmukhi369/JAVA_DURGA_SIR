package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.PROFIT_LOSS;

import java.util.Scanner;
public class ProfitAndLossSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int costPrice = scanner.nextInt();

        System.out.print("Enter the selling price: ");
        int sellingPrice = scanner.nextInt();

        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (costPrice > sellingPrice) {
            int loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit no loss");
        }
    }
}
