import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] years = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = scanner.nextInt();
            double bonus = years[i] > 5 ? 0.05 * salaries[i] : 0.02 * salaries[i];
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOld += salaries[i];
            totalNew += newSalaries[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOld);
        System.out.println("Total new salary: " + totalNew);
    }
}