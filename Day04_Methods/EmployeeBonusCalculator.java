import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[10][2]; // [][0] = salary, [][1] = years of service
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary between 10000 and 99999
            data[i][1] = rand.nextInt(11); // years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] result = new double[10][2]; // [][0] = new salary, [][1] = bonus amount
        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate and display sums and details in tabular format
    public static void displaySummary(int[][] data, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i+1, oldSalary, years, bonus, newSalary);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", sumOldSalary, totalBonus, sumNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] newSalaryBonus = calculateNewSalaryAndBonus(employeeData);
        displaySummary(employeeData, newSalaryBonus);
    }
}
