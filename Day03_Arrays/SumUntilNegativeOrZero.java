import java.util.Scanner;
public class SumUntilNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            if (index == 10) break;
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            if (num <= 0) break;
            numbers[index++] = num;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("Total: " + total);
    }
}