import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
       double salary = sc.nextDouble();
        int years = sc.nextInt();
// Condition
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}

