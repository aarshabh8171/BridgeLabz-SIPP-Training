import java.util.Scanner;
public class MaxTwoDigitsLimitedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (number != 0 && index < 10) {
            digits[index++] = number % 10;
            number /= 10;
        }
        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + second);
    }
}