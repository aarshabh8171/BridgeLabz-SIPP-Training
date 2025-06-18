import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to find the sum of n natural numbers using a loop
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = sumNaturalNumbers(n);

        System.out.println("The sum of " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
