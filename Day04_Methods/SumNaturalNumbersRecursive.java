import java.util.Scanner;

public class SumNaturalNumbersRecursive {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find sum using formula n(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than zero.");
            scanner.close();
            return;
        }

        int sumRec = sumRecursive(n);
        int sumFor = sumFormula(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFor);

        if (sumRec == sumFor) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }

        scanner.close();
    }
}
