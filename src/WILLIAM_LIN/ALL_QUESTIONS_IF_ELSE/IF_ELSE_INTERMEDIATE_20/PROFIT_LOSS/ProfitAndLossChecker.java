package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.PROFIT_LOSS;


import java.util.Scanner;
public class ProfitAndLossChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int costPrice = scanner.nextInt();

        System.out.print("Enter the selling price: ");
        int sellingPrice = scanner.nextInt();

        System.out.println(profitAndLossAnalyzer(costPrice,sellingPrice));
        scanner.close();
    }

    public static String profitAndLossAnalyzer(int costPrice, int sellingPrice) {
        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            return "Profit: " + profit;
        } else if (costPrice > sellingPrice) {
            int loss = costPrice - sellingPrice;
            return "Loss: " + loss;
        } else {
            return "No profit no loss";
        }
    }
}
