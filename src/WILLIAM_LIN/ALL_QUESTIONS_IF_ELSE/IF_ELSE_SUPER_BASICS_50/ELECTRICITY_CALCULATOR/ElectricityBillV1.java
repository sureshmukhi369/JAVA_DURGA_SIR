package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_SUPER_BASICS_50.ELECTRICITY_CALCULATOR;

/*
*
* ⚙️ 8️⃣. Electricity Bill Calculator
Given the number of units consumed:
For first 100 units → ₹1.5 per unit
Next 100 units → ₹2.5 per unit
Beyond 200 units → ₹4 per unit
Print the total bill.
*
* */

import java.util.Scanner;

public class ElectricityBillV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nubmer of units consumed: ");
        int unitsConsumed = scanner.nextInt();
        double bill = 0;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 1.5;
        } else if (unitsConsumed <= 200) {
            bill = (100 * 1.5) + ((unitsConsumed - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + ((unitsConsumed - 200) * 4);
        }

        System.out.println("Total Electricity Bill: " + bill);

    }
}
