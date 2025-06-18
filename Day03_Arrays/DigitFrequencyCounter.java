import java.util.Scanner;
public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = new int[10];
        while (number != 0) {
            int digit = number % 10;
            digits[digit]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + " occurs " + digits[i] + " times.");
            }
        }
    }
}