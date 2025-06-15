import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        double total = 0;
//Condition
        while (true) {
            double value = sc.nextDouble();
            if (value <= 0) break;
            total += value;
        }

        System.out.println("Total sum: " + total);
    }
}

