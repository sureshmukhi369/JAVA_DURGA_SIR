package WILLIAM_LIN.ALL_QUESTIONS_IF_ELSE.IF_ELSE_INTERMEDIATE_20.SALARY_CALCULATION;

/*
* ⚙️ 9️⃣. Salary Calculation with Allowances

If basic salary < 10,000 → HRA = 10%, DA = 90%
Else if between 10,000 and 20,000 → HRA = 15%, DA = 95%
Else → HRA = 20%, DA = 100%
Print gross salary.
*
* */


import java.util.Scanner;

public class SalaryCalculationV1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        int basicSalary = scanner.nextInt();

        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = 0.10 * basicSalary;
            da = 0.90 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.15 * basicSalary;
            da = 0.95 * basicSalary;
        } else {
            hra = 0.20 * basicSalary;
            da = 1.00 * basicSalary;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);
    }
}
